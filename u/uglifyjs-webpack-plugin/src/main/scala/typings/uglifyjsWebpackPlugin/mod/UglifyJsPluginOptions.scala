package typings.uglifyjsWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UglifyJsPluginOptions extends js.Object {
  
  var cache: js.UndefOr[Boolean | String] = js.native
  
  var exclude: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var extractComments: js.UndefOr[
    Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
  ] = js.native
  
  var include: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var parallel: js.UndefOr[Boolean | Double] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var test: js.UndefOr[RegExp | js.Array[RegExp]] = js.native
  
  var uglifyOptions: js.UndefOr[UglifyJsOptions] = js.native
  
  var warningsFilter: js.UndefOr[js.Function1[/* source */ String, Boolean]] = js.native
}
object UglifyJsPluginOptions {
  
  @scala.inline
  def apply(): UglifyJsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UglifyJsPluginOptions]
  }
  
  @scala.inline
  implicit class UglifyJsPluginOptionsOps[Self <: UglifyJsPluginOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCache(value: Boolean | String): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: RegExp*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: RegExp | js.Array[RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtractCommentsFunction2(value: (/* node */ js.Object, /* comment */ String) => Boolean): Self = this.set("extractComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtractComments(
      value: Boolean | RegExp | (js.Function2[/* node */ js.Object, /* comment */ String, Boolean]) | ExtractCommentsOptions
    ): Self = this.set("extractComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractComments: Self = this.set("extractComments", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: RegExp*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: RegExp | js.Array[RegExp]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: RegExp*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: RegExp | js.Array[RegExp]): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setUglifyOptions(value: UglifyJsOptions): Self = this.set("uglifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUglifyOptions: Self = this.set("uglifyOptions", js.undefined)
    
    @scala.inline
    def setWarningsFilter(value: /* source */ String => Boolean): Self = this.set("warningsFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
}
