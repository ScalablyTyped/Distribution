package typings.webpackBlocksUglify.mod

import typings.std.RegExp
import typings.uglifyJs.mod.MinifyOptions
import typings.webpackBlocksUglify.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var cache: js.UndefOr[String | Boolean] = js.native
  
  var cacheKeys: js.UndefOr[js.Function2[/* defaultCacheKeys */ js.Any, /* file */ js.Any, js.Object]] = js.native
  
  var chunkFilter: js.UndefOr[js.Function1[/* chunk */ js.Any, Boolean]] = js.native
  
  var exclude: js.UndefOr[TestType | js.Array[TestType]] = js.native
  
  var extractComments: js.UndefOr[Boolean | String | RegExp | ExtractCommentsFunction] = js.native
  
  var include: js.UndefOr[TestType | js.Array[TestType]] = js.native
  
  var minify: js.UndefOr[js.Function2[/* file */ js.Any, /* sourceMap */ js.Any, Code]] = js.native
  
  var parallel: js.UndefOr[Boolean | Double] = js.native
  
  var sourceMap: js.UndefOr[Boolean] = js.native
  
  var test: js.UndefOr[TestType | js.Array[TestType]] = js.native
  
  var uglifyOptions: js.UndefOr[MinifyOptions] = js.native
  
  var warningsFilter: js.UndefOr[js.Function2[/* warning */ js.Any, /* source */ js.Any, Boolean]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setCache(value: String | Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCacheKeys(value: (/* defaultCacheKeys */ js.Any, /* file */ js.Any) => js.Object): Self = this.set("cacheKeys", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCacheKeys: Self = this.set("cacheKeys", js.undefined)
    
    @scala.inline
    def setChunkFilter(value: /* chunk */ js.Any => Boolean): Self = this.set("chunkFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChunkFilter: Self = this.set("chunkFilter", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: TestType*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: TestType | js.Array[TestType]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setExtractCommentsFunction2(value: (/* node */ js.Any, /* comment */ js.Any) => Boolean | ExtractCommentsObject): Self = this.set("extractComments", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExtractComments(value: Boolean | String | RegExp | ExtractCommentsFunction): Self = this.set("extractComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtractComments: Self = this.set("extractComments", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: TestType*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: TestType | js.Array[TestType]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setMinify(value: (/* file */ js.Any, /* sourceMap */ js.Any) => Code): Self = this.set("minify", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMinify: Self = this.set("minify", js.undefined)
    
    @scala.inline
    def setParallel(value: Boolean | Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
    
    @scala.inline
    def setTestVarargs(value: TestType*): Self = this.set("test", js.Array(value :_*))
    
    @scala.inline
    def setTest(value: TestType | js.Array[TestType]): Self = this.set("test", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTest: Self = this.set("test", js.undefined)
    
    @scala.inline
    def setUglifyOptions(value: MinifyOptions): Self = this.set("uglifyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUglifyOptions: Self = this.set("uglifyOptions", js.undefined)
    
    @scala.inline
    def setWarningsFilter(value: (/* warning */ js.Any, /* source */ js.Any) => Boolean): Self = this.set("warningsFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteWarningsFilter: Self = this.set("warningsFilter", js.undefined)
  }
}
