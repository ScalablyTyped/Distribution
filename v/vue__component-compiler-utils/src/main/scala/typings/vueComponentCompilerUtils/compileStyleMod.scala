package typings.vueComponentCompilerUtils

import typings.postcss.mod.LazyResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileStyleMod {
  
  @JSImport("@vue/component-compiler-utils/dist/compileStyle", "compileStyle")
  @js.native
  def compileStyle(options: StyleCompileOptions): StyleCompileResults = js.native
  
  @JSImport("@vue/component-compiler-utils/dist/compileStyle", "compileStyleAsync")
  @js.native
  def compileStyleAsync(options: StyleCompileOptions): js.Promise[StyleCompileResults] = js.native
  
  @JSImport("@vue/component-compiler-utils/dist/compileStyle", "doCompileStyle")
  @js.native
  def doCompileStyle(options: AsyncStyleCompileOptions): StyleCompileResults = js.native
  
  @js.native
  trait AsyncStyleCompileOptions extends StyleCompileOptions {
    
    var isAsync: js.UndefOr[Boolean] = js.native
  }
  object AsyncStyleCompileOptions {
    
    @scala.inline
    def apply(filename: String, id: String, source: String): AsyncStyleCompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[AsyncStyleCompileOptions]
    }
    
    @scala.inline
    implicit class AsyncStyleCompileOptionsMutableBuilder[Self <: AsyncStyleCompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsAsync(value: Boolean): Self = StObject.set(x, "isAsync", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAsyncUndefined: Self = StObject.set(x, "isAsync", js.undefined)
    }
  }
  
  @js.native
  trait StyleCompileOptions extends StObject {
    
    var filename: String = js.native
    
    var id: String = js.native
    
    var map: js.UndefOr[js.Any] = js.native
    
    var postcssOptions: js.UndefOr[js.Any] = js.native
    
    var postcssPlugins: js.UndefOr[js.Array[_]] = js.native
    
    var preprocessLang: js.UndefOr[String] = js.native
    
    var preprocessOptions: js.UndefOr[js.Any] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var source: String = js.native
    
    var trim: js.UndefOr[Boolean] = js.native
  }
  object StyleCompileOptions {
    
    @scala.inline
    def apply(filename: String, id: String, source: String): StyleCompileOptions = {
      val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleCompileOptions]
    }
    
    @scala.inline
    implicit class StyleCompileOptionsMutableBuilder[Self <: StyleCompileOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
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
      def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
      
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
    }
  }
  
  @js.native
  trait StyleCompileResults extends StObject {
    
    var code: String = js.native
    
    var errors: js.Array[String] = js.native
    
    var map: js.Any | Unit = js.native
    
    var rawResult: LazyResult | Unit = js.native
  }
  object StyleCompileResults {
    
    @scala.inline
    def apply(code: String, errors: js.Array[String], map: js.Any | Unit, rawResult: LazyResult | Unit): StyleCompileResults = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], rawResult = rawResult.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyleCompileResults]
    }
    
    @scala.inline
    implicit class StyleCompileResultsMutableBuilder[Self <: StyleCompileResults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrors(value: js.Array[String]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorsVarargs(value: String*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      @scala.inline
      def setMap(value: js.Any | Unit): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawResult(value: LazyResult | Unit): Self = StObject.set(x, "rawResult", value.asInstanceOf[js.Any])
    }
  }
}
