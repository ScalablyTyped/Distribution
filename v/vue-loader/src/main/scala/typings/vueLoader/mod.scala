package typings.vueLoader

import org.scalablytyped.runtime.StringDictionary
import typings.std.Plugin
import typings.vueComponentCompilerUtils.typesMod.VueTemplateCompiler
import typings.vueTemplateCompiler.mod.CompilerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-loader", "VueLoaderPlugin")
  @js.native
  class VueLoaderPlugin () extends Plugin
  
  @js.native
  trait VueLoaderOptions extends StObject {
    
    var cacheDirectory: js.UndefOr[String] = js.native
    
    var cacheIdentifier: js.UndefOr[String] = js.native
    
    var compiler: js.UndefOr[VueTemplateCompiler] = js.native
    
    var compilerOptions: js.UndefOr[CompilerOptions] = js.native
    
    var exposeFilename: js.UndefOr[Boolean] = js.native
    
    var hotReload: js.UndefOr[Boolean] = js.native
    
    var optimizeSSR: js.UndefOr[Boolean] = js.native
    
    var prettify: js.UndefOr[Boolean] = js.native
    
    var productionMode: js.UndefOr[Boolean] = js.native
    
    var shadowMode: js.UndefOr[Boolean] = js.native
    
    var transformAssetUrls: js.UndefOr[StringDictionary[String | js.Array[String]]] = js.native
    
    var transpileOptions: js.UndefOr[js.Object] = js.native
  }
  object VueLoaderOptions {
    
    @scala.inline
    def apply(): VueLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueLoaderOptions]
    }
    
    @scala.inline
    implicit class VueLoaderOptionsMutableBuilder[Self <: VueLoaderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheDirectory(value: String): Self = StObject.set(x, "cacheDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheDirectoryUndefined: Self = StObject.set(x, "cacheDirectory", js.undefined)
      
      @scala.inline
      def setCacheIdentifier(value: String): Self = StObject.set(x, "cacheIdentifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheIdentifierUndefined: Self = StObject.set(x, "cacheIdentifier", js.undefined)
      
      @scala.inline
      def setCompiler(value: VueTemplateCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      @scala.inline
      def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      @scala.inline
      def setExposeFilename(value: Boolean): Self = StObject.set(x, "exposeFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExposeFilenameUndefined: Self = StObject.set(x, "exposeFilename", js.undefined)
      
      @scala.inline
      def setHotReload(value: Boolean): Self = StObject.set(x, "hotReload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHotReloadUndefined: Self = StObject.set(x, "hotReload", js.undefined)
      
      @scala.inline
      def setOptimizeSSR(value: Boolean): Self = StObject.set(x, "optimizeSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimizeSSRUndefined: Self = StObject.set(x, "optimizeSSR", js.undefined)
      
      @scala.inline
      def setPrettify(value: Boolean): Self = StObject.set(x, "prettify", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettifyUndefined: Self = StObject.set(x, "prettify", js.undefined)
      
      @scala.inline
      def setProductionMode(value: Boolean): Self = StObject.set(x, "productionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProductionModeUndefined: Self = StObject.set(x, "productionMode", js.undefined)
      
      @scala.inline
      def setShadowMode(value: Boolean): Self = StObject.set(x, "shadowMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowModeUndefined: Self = StObject.set(x, "shadowMode", js.undefined)
      
      @scala.inline
      def setTransformAssetUrls(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
      
      @scala.inline
      def setTranspileOptions(value: js.Object): Self = StObject.set(x, "transpileOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranspileOptionsUndefined: Self = StObject.set(x, "transpileOptions", js.undefined)
    }
  }
}
