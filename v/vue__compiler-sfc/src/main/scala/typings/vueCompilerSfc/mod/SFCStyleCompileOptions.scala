package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCStyleCompileOptions extends js.Object {
  
  var filename: String = js.native
  
  var id: String = js.native
  
  var map: js.UndefOr[RawSourceMap] = js.native
  
  var postcssOptions: js.UndefOr[js.Any] = js.native
  
  var postcssPlugins: js.UndefOr[js.Array[_]] = js.native
  
  var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, _]] = js.native
  
  var preprocessLang: js.UndefOr[PreprocessLang] = js.native
  
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  
  var scoped: js.UndefOr[Boolean] = js.native
  
  var source: String = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
  
  var vars: js.UndefOr[Boolean] = js.native
}
object SFCStyleCompileOptions {
  
  @scala.inline
  def apply(filename: String, id: String, source: String): SFCStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleCompileOptions]
  }
  
  @scala.inline
  implicit class SFCStyleCompileOptionsOps[Self <: SFCStyleCompileOptions] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = this.set("map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPostcssOptions(value: js.Any): Self = this.set("postcssOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostcssOptions: Self = this.set("postcssOptions", js.undefined)
    
    @scala.inline
    def setPostcssPluginsVarargs(value: js.Any*): Self = this.set("postcssPlugins", js.Array(value :_*))
    
    @scala.inline
    def setPostcssPlugins(value: js.Array[_]): Self = this.set("postcssPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostcssPlugins: Self = this.set("postcssPlugins", js.undefined)
    
    @scala.inline
    def setPreprocessCustomRequire(value: /* id */ String => _): Self = this.set("preprocessCustomRequire", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePreprocessCustomRequire: Self = this.set("preprocessCustomRequire", js.undefined)
    
    @scala.inline
    def setPreprocessLang(value: PreprocessLang): Self = this.set("preprocessLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessLang: Self = this.set("preprocessLang", js.undefined)
    
    @scala.inline
    def setPreprocessOptions(value: js.Any): Self = this.set("preprocessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreprocessOptions: Self = this.set("preprocessOptions", js.undefined)
    
    @scala.inline
    def setScoped(value: Boolean): Self = this.set("scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScoped: Self = this.set("scoped", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
    
    @scala.inline
    def setVars(value: Boolean): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
}
