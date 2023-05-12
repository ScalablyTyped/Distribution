package typings.vueCompilerSfc.mod

import typings.sourceMapJs.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCStyleCompileOptions extends StObject {
  
  var filename: String
  
  var id: String
  
  var inMap: js.UndefOr[RawSourceMap] = js.undefined
  
  var isProd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use `inMap` instead.
    */
  var map: js.UndefOr[RawSourceMap] = js.undefined
  
  var postcssOptions: js.UndefOr[Any] = js.undefined
  
  var postcssPlugins: js.UndefOr[js.Array[Any]] = js.undefined
  
  var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, Any]] = js.undefined
  
  var preprocessLang: js.UndefOr[PreprocessLang] = js.undefined
  
  var preprocessOptions: js.UndefOr[Any] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var source: String
  
  var trim: js.UndefOr[Boolean] = js.undefined
}
object SFCStyleCompileOptions {
  
  inline def apply(filename: String, id: String, source: String): SFCStyleCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCStyleCompileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCStyleCompileOptions] (val x: Self) extends AnyVal {
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInMap(value: RawSourceMap): Self = StObject.set(x, "inMap", value.asInstanceOf[js.Any])
    
    inline def setInMapUndefined: Self = StObject.set(x, "inMap", js.undefined)
    
    inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
    
    inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
    
    inline def setMap(value: RawSourceMap): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setPostcssOptions(value: Any): Self = StObject.set(x, "postcssOptions", value.asInstanceOf[js.Any])
    
    inline def setPostcssOptionsUndefined: Self = StObject.set(x, "postcssOptions", js.undefined)
    
    inline def setPostcssPlugins(value: js.Array[Any]): Self = StObject.set(x, "postcssPlugins", value.asInstanceOf[js.Any])
    
    inline def setPostcssPluginsUndefined: Self = StObject.set(x, "postcssPlugins", js.undefined)
    
    inline def setPostcssPluginsVarargs(value: Any*): Self = StObject.set(x, "postcssPlugins", js.Array(value*))
    
    inline def setPreprocessCustomRequire(value: /* id */ String => Any): Self = StObject.set(x, "preprocessCustomRequire", js.Any.fromFunction1(value))
    
    inline def setPreprocessCustomRequireUndefined: Self = StObject.set(x, "preprocessCustomRequire", js.undefined)
    
    inline def setPreprocessLang(value: PreprocessLang): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
    
    inline def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
    
    inline def setPreprocessOptions(value: Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
    
    inline def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTrim(value: Boolean): Self = StObject.set(x, "trim", value.asInstanceOf[js.Any])
    
    inline def setTrimUndefined: Self = StObject.set(x, "trim", js.undefined)
  }
}
