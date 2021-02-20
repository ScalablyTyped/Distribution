package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCStyleCompileOptions extends StObject {
  
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
  implicit class SFCStyleCompileOptionsMutableBuilder[Self <: SFCStyleCompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    @scala.inline
    def setPostcssOptions(value: js.Any): Self = StObject.set(x, "postcssOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcssOptionsUndefined: Self = StObject.set(x, "postcssOptions", js.undefined)
    
    @scala.inline
    def setPostcssPlugins(value: js.Array[_]): Self = StObject.set(x, "postcssPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostcssPluginsUndefined: Self = StObject.set(x, "postcssPlugins", js.undefined)
    
    @scala.inline
    def setPostcssPluginsVarargs(value: js.Any*): Self = StObject.set(x, "postcssPlugins", js.Array(value :_*))
    
    @scala.inline
    def setPreprocessCustomRequire(value: /* id */ String => _): Self = StObject.set(x, "preprocessCustomRequire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreprocessCustomRequireUndefined: Self = StObject.set(x, "preprocessCustomRequire", js.undefined)
    
    @scala.inline
    def setPreprocessLang(value: PreprocessLang): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
    
    @scala.inline
    def setPreprocessOptions(value: js.Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
    
    @scala.inline
    def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
    
    @scala.inline
    def setVars(value: Boolean): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVarsUndefined: Self = StObject.set(x, "vars", js.undefined)
  }
}
