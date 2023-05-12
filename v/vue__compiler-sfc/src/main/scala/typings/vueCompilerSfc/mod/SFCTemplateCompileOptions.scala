package typings.vueCompilerSfc.mod

import typings.sourceMapJs.mod.RawSourceMap
import typings.vueCompilerCore.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SFCTemplateCompileOptions extends StObject {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.undefined
  
  var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
  
  var filename: String
  
  var id: String
  
  var inMap: js.UndefOr[RawSourceMap] = js.undefined
  
  var isProd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * In some cases, compiler-sfc may not be inside the project root (e.g. when
    * linked or globally installed). In such cases a custom `require` can be
    * passed to correctly resolve the preprocessors.
    */
  var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, Any]] = js.undefined
  
  var preprocessLang: js.UndefOr[String] = js.undefined
  
  var preprocessOptions: js.UndefOr[Any] = js.undefined
  
  var scoped: js.UndefOr[Boolean] = js.undefined
  
  var slotted: js.UndefOr[Boolean] = js.undefined
  
  var source: String
  
  var ssr: js.UndefOr[Boolean] = js.undefined
  
  var ssrCssVars: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Configure what tags/attributes to transform into asset url imports,
    * or disable the transform altogether with `false`.
    */
  var transformAssetUrls: js.UndefOr[AssetURLOptions | AssetURLTagConfig | Boolean] = js.undefined
}
object SFCTemplateCompileOptions {
  
  inline def apply(filename: String, id: String, source: String): SFCTemplateCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateCompileOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SFCTemplateCompileOptions] (val x: Self) extends AnyVal {
    
    inline def setCompiler(value: TemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInMap(value: RawSourceMap): Self = StObject.set(x, "inMap", value.asInstanceOf[js.Any])
    
    inline def setInMapUndefined: Self = StObject.set(x, "inMap", js.undefined)
    
    inline def setIsProd(value: Boolean): Self = StObject.set(x, "isProd", value.asInstanceOf[js.Any])
    
    inline def setIsProdUndefined: Self = StObject.set(x, "isProd", js.undefined)
    
    inline def setPreprocessCustomRequire(value: /* id */ String => Any): Self = StObject.set(x, "preprocessCustomRequire", js.Any.fromFunction1(value))
    
    inline def setPreprocessCustomRequireUndefined: Self = StObject.set(x, "preprocessCustomRequire", js.undefined)
    
    inline def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
    
    inline def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
    
    inline def setPreprocessOptions(value: Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
    
    inline def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
    
    inline def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    inline def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
    
    inline def setSlotted(value: Boolean): Self = StObject.set(x, "slotted", value.asInstanceOf[js.Any])
    
    inline def setSlottedUndefined: Self = StObject.set(x, "slotted", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    inline def setSsrCssVars(value: js.Array[String]): Self = StObject.set(x, "ssrCssVars", value.asInstanceOf[js.Any])
    
    inline def setSsrCssVarsUndefined: Self = StObject.set(x, "ssrCssVars", js.undefined)
    
    inline def setSsrCssVarsVarargs(value: String*): Self = StObject.set(x, "ssrCssVars", js.Array(value*))
    
    inline def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    inline def setTransformAssetUrls(value: AssetURLOptions | AssetURLTagConfig | Boolean): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
    
    inline def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
  }
}
