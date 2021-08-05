package typings.vueComponentCompilerUtils

import typings.vueComponentCompilerUtils.assetUrlMod.AssetURLOptions
import typings.vueComponentCompilerUtils.assetUrlMod.TransformAssetUrlsOptions
import typings.vueComponentCompilerUtils.typesMod.ErrorWithRange
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compileTemplateMod {
  
  @JSImport("@vue/component-compiler-utils/dist/compileTemplate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compileTemplate(options: TemplateCompileOptions): TemplateCompileResult = ^.asInstanceOf[js.Dynamic].applyDynamic("compileTemplate")(options.asInstanceOf[js.Any]).asInstanceOf[TemplateCompileResult]
  
  trait TemplateCompileOptions extends StObject {
    
    var compiler: VueTemplateCompiler
    
    var compilerOptions: js.UndefOr[VueTemplateCompilerOptions] = js.undefined
    
    var filename: String
    
    var isFunctional: js.UndefOr[Boolean] = js.undefined
    
    var isProduction: js.UndefOr[Boolean] = js.undefined
    
    var optimizeSSR: js.UndefOr[Boolean] = js.undefined
    
    var preprocessLang: js.UndefOr[String] = js.undefined
    
    var preprocessOptions: js.UndefOr[js.Any] = js.undefined
    
    var prettify: js.UndefOr[Boolean] = js.undefined
    
    var source: String
    
    var transformAssetUrls: js.UndefOr[AssetURLOptions | Boolean] = js.undefined
    
    var transformAssetUrlsOptions: js.UndefOr[TransformAssetUrlsOptions] = js.undefined
    
    var transpileOptions: js.UndefOr[js.Any] = js.undefined
  }
  object TemplateCompileOptions {
    
    inline def apply(compiler: VueTemplateCompiler, filename: String, source: String): TemplateCompileOptions = {
      val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCompileOptions]
    }
    
    extension [Self <: TemplateCompileOptions](x: Self) {
      
      inline def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptions(value: VueTemplateCompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setIsFunctional(value: Boolean): Self = StObject.set(x, "isFunctional", value.asInstanceOf[js.Any])
      
      inline def setIsFunctionalUndefined: Self = StObject.set(x, "isFunctional", js.undefined)
      
      inline def setIsProduction(value: Boolean): Self = StObject.set(x, "isProduction", value.asInstanceOf[js.Any])
      
      inline def setIsProductionUndefined: Self = StObject.set(x, "isProduction", js.undefined)
      
      inline def setOptimizeSSR(value: Boolean): Self = StObject.set(x, "optimizeSSR", value.asInstanceOf[js.Any])
      
      inline def setOptimizeSSRUndefined: Self = StObject.set(x, "optimizeSSR", js.undefined)
      
      inline def setPreprocessLang(value: String): Self = StObject.set(x, "preprocessLang", value.asInstanceOf[js.Any])
      
      inline def setPreprocessLangUndefined: Self = StObject.set(x, "preprocessLang", js.undefined)
      
      inline def setPreprocessOptions(value: js.Any): Self = StObject.set(x, "preprocessOptions", value.asInstanceOf[js.Any])
      
      inline def setPreprocessOptionsUndefined: Self = StObject.set(x, "preprocessOptions", js.undefined)
      
      inline def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrls(value: AssetURLOptions | Boolean): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrlsOptions(value: TransformAssetUrlsOptions): Self = StObject.set(x, "transformAssetUrlsOptions", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrlsOptionsUndefined: Self = StObject.set(x, "transformAssetUrlsOptions", js.undefined)
      
      inline def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
      
      inline def setTranspileOptions(value: js.Any): Self = StObject.set(x, "transpileOptions", value.asInstanceOf[js.Any])
      
      inline def setTranspileOptionsUndefined: Self = StObject.set(x, "transpileOptions", js.undefined)
    }
  }
  
  trait TemplateCompileResult extends StObject {
    
    var ast: js.UndefOr[js.Object] = js.undefined
    
    var code: String
    
    var errors: js.Array[String | ErrorWithRange]
    
    var source: String
    
    var tips: js.Array[String | ErrorWithRange]
  }
  object TemplateCompileResult {
    
    inline def apply(
      code: String,
      errors: js.Array[String | ErrorWithRange],
      source: String,
      tips: js.Array[String | ErrorWithRange]
    ): TemplateCompileResult = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], tips = tips.asInstanceOf[js.Any])
      __obj.asInstanceOf[TemplateCompileResult]
    }
    
    extension [Self <: TemplateCompileResult](x: Self) {
      
      inline def setAst(value: js.Object): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
      
      inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setErrors(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "errors", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTips(value: js.Array[String | ErrorWithRange]): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      inline def setTipsVarargs(value: (String | ErrorWithRange)*): Self = StObject.set(x, "tips", js.Array(value :_*))
    }
  }
}
