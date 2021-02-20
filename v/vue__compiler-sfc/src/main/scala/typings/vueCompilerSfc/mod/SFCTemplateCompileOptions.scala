package typings.vueCompilerSfc.mod

import typings.sourceMap.mod.RawSourceMap
import typings.vueCompilerCore.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SFCTemplateCompileOptions extends StObject {
  
  var compiler: js.UndefOr[TemplateCompiler] = js.native
  
  var compilerOptions: js.UndefOr[CompilerOptions] = js.native
  
  var filename: String = js.native
  
  var inMap: js.UndefOr[RawSourceMap] = js.native
  
  /**
    * In some cases, compiler-sfc may not be inside the project root (e.g. when
    * linked or globally installed). In such cases a custom `require` can be
    * passed to correctly resolve the preprocessors.
    */
  var preprocessCustomRequire: js.UndefOr[js.Function1[/* id */ String, _]] = js.native
  
  var preprocessLang: js.UndefOr[String] = js.native
  
  var preprocessOptions: js.UndefOr[js.Any] = js.native
  
  var source: String = js.native
  
  var ssr: js.UndefOr[Boolean] = js.native
  
  /**
    * Configure what tags/attributes to transform into asset url imports,
    * or disable the transform altogether with `false`.
    */
  var transformAssetUrls: js.UndefOr[AssetURLOptions | AssetURLTagConfig | Boolean] = js.native
}
object SFCTemplateCompileOptions {
  
  @scala.inline
  def apply(filename: String, source: String): SFCTemplateCompileOptions = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFCTemplateCompileOptions]
  }
  
  @scala.inline
  implicit class SFCTemplateCompileOptionsMutableBuilder[Self <: SFCTemplateCompileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompiler(value: TemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
    
    @scala.inline
    def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMap(value: RawSourceMap): Self = StObject.set(x, "inMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInMapUndefined: Self = StObject.set(x, "inMap", js.undefined)
    
    @scala.inline
    def setPreprocessCustomRequire(value: /* id */ String => _): Self = StObject.set(x, "preprocessCustomRequire", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPreprocessCustomRequireUndefined: Self = StObject.set(x, "preprocessCustomRequire", js.undefined)
    
    @scala.inline
    def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
    
    @scala.inline
    def setPreprocessOptions(value: js.Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsr(value: Boolean): Self = StObject.set(x, "ssr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsrUndefined: Self = StObject.set(x, "ssr", js.undefined)
    
    @scala.inline
    def setTransformAssetUrls(value: AssetURLOptions | AssetURLTagConfig | Boolean): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
  }
}
