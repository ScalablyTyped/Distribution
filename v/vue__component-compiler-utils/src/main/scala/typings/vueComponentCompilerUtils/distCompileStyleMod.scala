package typings.vueComponentCompilerUtils

import typings.postcss.mod.LazyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileStyleMod {
  
  @JSImport("@vue/component-compiler-utils/dist/compileStyle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileStyle(options: StyleCompileOptions): StyleCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[StyleCompileResults]
  
  inline def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = ^.asInstanceOf[js.Dynamic].applyDynamic("compileStyleAsync")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[StyleCompileResults]]
  
  inline def doCompileStyle(options: AsyncStyleCompileOptions): StyleCompileResults = ^.asInstanceOf[js.Dynamic].applyDynamic("doCompileStyle")(options.asInstanceOf[js.Any]).asInstanceOf[StyleCompileResults]
  
  trait AsyncStyleCompileOptions
    extends StObject
       with StyleCompileOptions {
    
    var isAsync: js.UndefOr[Boolean] = js.undefined
  }
  object AsyncStyleCompileOptions {
    
    inline def apply(filename: String, id: String, source: String): AsyncStyleCompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncStyleCompileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AsyncStyleCompileOptions] (val x: Self) extends AnyVal {
      
      inline def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      inline def setIsAsyncUndefined: Self = StObject.set(x, "isAsync", js.undefined)
    }
  }
  
  trait StyleCompileOptions extends StObject {
    
    var filename: String
    
    var id: String
    
    var map: js.UndefOr[Any] = js.undefined
    
    var postcssOptions: js.UndefOr[Any] = js.undefined
    
    var postcssPlugins: js.UndefOr[js.Array[Any]] = js.undefined
    
    var preprocessLang: js.UndefOr[String] = js.undefined
    
    var preprocessOptions: js.UndefOr[Any] = js.undefined
    
    var scoped: js.UndefOr[Boolean] = js.undefined
    
    var source: String
    
    var trim: js.UndefOr[Boolean] = js.undefined
  }
  object StyleCompileOptions {
    
    inline def apply(filename: String, id: String, source: String): StyleCompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleCompileOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleCompileOptions] (val x: Self) extends AnyVal {
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMap(value: Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
      
      inline def setPostcssOptions(value: Any): Self = StObject.set(x, "postcssOptions", value.asInstanceOf[js.Any])
      
      inline def setPostcssOptionsUndefined: Self = StObject.set(x, "postcssOptions", js.undefined)
      
      inline def setPostcssPlugins(value: js.Array[Any]): Self = StObject.set(x, "postcssPlugins", value.asInstanceOf[js.Any])
      
      inline def setPostcssPluginsUndefined: Self = StObject.set(x, "postcssPlugins", js.undefined)
      
      inline def setPostcssPluginsVarargs(value: Any*): Self = StObject.set(x, "postcssPlugins", js.Array(value*))
      
      inline def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
      
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
  
  trait StyleCompileResults extends StObject {
    
    var code: String
    
    var errors: js.Array[String]
    
    var map: Any | Unit
    
    var rawResult: LazyResult | Unit
  }
  object StyleCompileResults {
    
    inline def apply(code: String, errors: js.Array[String], map: Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleCompileResults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StyleCompileResults] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setMap(value: Any | Unit): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setRawResult(value: LazyResult | Unit): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
    }
  }
}
