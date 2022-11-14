package typings.vueLoader

import org.scalablytyped.runtime.StringDictionary
import typings.vueComponentCompilerUtils.distTypesMod.VueTemplateCompiler
import typings.vueTemplateCompiler.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("vue-loader", "VueLoaderPlugin")
  @js.native
  open class VueLoaderPlugin () extends StObject
  
  trait VueLoaderOptions extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.undefined
    
    var cacheIdentifier: js.UndefOr[String] = js.undefined
    
    var compiler: js.UndefOr[VueTemplateCompiler] = js.undefined
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.undefined
    
    var exposeFilename: js.UndefOr[Boolean] = js.undefined
    
    var hotReload: js.UndefOr[Boolean] = js.undefined
    
    var optimizeSSR: js.UndefOr[Boolean] = js.undefined
    
    var prettify: js.UndefOr[Boolean] = js.undefined
    
    var productionMode: js.UndefOr[Boolean] = js.undefined
    
    var shadowMode: js.UndefOr[Boolean] = js.undefined
    
    var transformAssetUrls: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.undefined
    
    var transpileOptions: js.UndefOr[js.Object] = js.undefined
  }
  object VueLoaderOptions {
    
    inline def apply(): VueLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueLoaderOptions]
    }
    
    extension [Self <: VueLoaderOptions](x: Self) {
      
      inline def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      inline def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      inline def setCacheIdentifier(value: String): Self = StObject.set(x, "cacheIdentifier", value.asInstanceOf[js.Any])
      
      inline def setCacheIdentifierUndefined: Self = StObject.set(x, "cacheIdentifier", js.undefined)
      
      inline def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setExposeFilename(value: Boolean): Self = StObject.set(x, "exposeFilename", value.asInstanceOf[js.Any])
      
      inline def setExposeFilenameUndefined: Self = StObject.set(x, "exposeFilename", js.undefined)
      
      inline def setHotReload(value: Boolean): Self = StObject.set(x, "hotReload", value.asInstanceOf[js.Any])
      
      inline def setHotReloadUndefined: Self = StObject.set(x, "hotReload", js.undefined)
      
      inline def setOptimizeSSR(value: Boolean): Self = StObject.set(x, "optimizeSSR", value.asInstanceOf[js.Any])
      
      inline def setOptimizeSSRUndefined: Self = StObject.set(x, "optimizeSSR", js.undefined)
      
      inline def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      inline def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      inline def setProductionMode(value: Boolean): Self = StObject.set(x, "productionMode", value.asInstanceOf[js.Any])
      
      inline def setProductionModeUndefined: Self = StObject.set(x, "productionMode", js.undefined)
      
      inline def setShadowMode(value: Boolean): Self = StObject.set(x, "shadowMode", value.asInstanceOf[js.Any])
      
      inline def setShadowModeUndefined: Self = StObject.set(x, "shadowMode", js.undefined)
      
      inline def setTransformAssetUrls(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
      
      inline def setTranspileOptions(value: js.Object): Self = StObject.set(x, "transpileOptions", value.asInstanceOf[js.Any])
      
      inline def setTranspileOptionsUndefined: Self = StObject.set(x, "transpileOptions", js.undefined)
    }
  }
}
