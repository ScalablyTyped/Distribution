package typings.vueLoader

import typings.vueLoader.distPluginMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vue-loader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(source: String): String | Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(source.asInstanceOf[js.Any]).asInstanceOf[String | Unit]
  
  /* was `typeof VueLoaderPlugin` */
  @JSImport("vue-loader", "VueLoaderPlugin")
  @js.native
  open class VueLoaderPlugin () extends default
  /* was `typeof VueLoaderPlugin` */
  object VueLoaderPlugin {
    
    @JSImport("vue-loader", "VueLoaderPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("vue-loader", "VueLoaderPlugin.NS")
    @js.native
    def NS: String = js.native
    inline def NS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NS")(x.asInstanceOf[js.Any])
  }
  
  trait VueLoaderOptions extends StObject {
    
    var appendExtension: js.UndefOr[Boolean] = js.undefined
    
    var babelParserPlugins: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptCompileOptions * / any['babelParserPlugins'] */ js.Any
      ] = js.undefined
    
    var compiler: js.UndefOr[
        (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateCompiler */ Any) | String
      ] = js.undefined
    
    var compilerOptions: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any
      ] = js.undefined
    
    var customElement: js.UndefOr[Boolean | js.RegExp] = js.undefined
    
    /**
      * @experimental
      */
    var defineModel: js.UndefOr[Boolean] = js.undefined
    
    var enableTsInTemplate: js.UndefOr[Boolean] = js.undefined
    
    var exposeFilename: js.UndefOr[Boolean] = js.undefined
    
    var hotReload: js.UndefOr[Boolean] = js.undefined
    
    var isServerBuild: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @experimental
      */
    var propsDestructure: js.UndefOr[Boolean] = js.undefined
    
    /**
      * TODO remove in 3.4
      * @deprecated
      */
    var reactivityTransform: js.UndefOr[Boolean] = js.undefined
    
    var transformAssetUrls: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCTemplateCompileOptions * / any['transformAssetUrls'] */ js.Any
      ] = js.undefined
  }
  object VueLoaderOptions {
    
    inline def apply(): VueLoaderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VueLoaderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: VueLoaderOptions] (val x: Self) extends AnyVal {
      
      inline def setAppendExtension(value: Boolean): Self = StObject.set(x, "appendExtension", value.asInstanceOf[js.Any])
      
      inline def setAppendExtensionUndefined: Self = StObject.set(x, "appendExtension", js.undefined)
      
      inline def setBabelParserPlugins(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCScriptCompileOptions * / any['babelParserPlugins'] */ js.Any
      ): Self = StObject.set(x, "babelParserPlugins", value.asInstanceOf[js.Any])
      
      inline def setBabelParserPluginsUndefined: Self = StObject.set(x, "babelParserPlugins", js.undefined)
      
      inline def setCompiler(
        value: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify TemplateCompiler */ Any) | String
      ): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptions(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerOptions */ Any
      ): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
      
      inline def setCompilerOptionsUndefined: Self = StObject.set(x, "compilerOptions", js.undefined)
      
      inline def setCompilerUndefined: Self = StObject.set(x, "compiler", js.undefined)
      
      inline def setCustomElement(value: Boolean | js.RegExp): Self = StObject.set(x, "customElement", value.asInstanceOf[js.Any])
      
      inline def setCustomElementUndefined: Self = StObject.set(x, "customElement", js.undefined)
      
      inline def setDefineModel(value: Boolean): Self = StObject.set(x, "defineModel", value.asInstanceOf[js.Any])
      
      inline def setDefineModelUndefined: Self = StObject.set(x, "defineModel", js.undefined)
      
      inline def setEnableTsInTemplate(value: Boolean): Self = StObject.set(x, "enableTsInTemplate", value.asInstanceOf[js.Any])
      
      inline def setEnableTsInTemplateUndefined: Self = StObject.set(x, "enableTsInTemplate", js.undefined)
      
      inline def setExposeFilename(value: Boolean): Self = StObject.set(x, "exposeFilename", value.asInstanceOf[js.Any])
      
      inline def setExposeFilenameUndefined: Self = StObject.set(x, "exposeFilename", js.undefined)
      
      inline def setHotReload(value: Boolean): Self = StObject.set(x, "hotReload", value.asInstanceOf[js.Any])
      
      inline def setHotReloadUndefined: Self = StObject.set(x, "hotReload", js.undefined)
      
      inline def setIsServerBuild(value: Boolean): Self = StObject.set(x, "isServerBuild", value.asInstanceOf[js.Any])
      
      inline def setIsServerBuildUndefined: Self = StObject.set(x, "isServerBuild", js.undefined)
      
      inline def setPropsDestructure(value: Boolean): Self = StObject.set(x, "propsDestructure", value.asInstanceOf[js.Any])
      
      inline def setPropsDestructureUndefined: Self = StObject.set(x, "propsDestructure", js.undefined)
      
      inline def setReactivityTransform(value: Boolean): Self = StObject.set(x, "reactivityTransform", value.asInstanceOf[js.Any])
      
      inline def setReactivityTransformUndefined: Self = StObject.set(x, "reactivityTransform", js.undefined)
      
      inline def setTransformAssetUrls(
        value: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SFCTemplateCompileOptions * / any['transformAssetUrls'] */ js.Any
      ): Self = StObject.set(x, "transformAssetUrls", value.asInstanceOf[js.Any])
      
      inline def setTransformAssetUrlsUndefined: Self = StObject.set(x, "transformAssetUrls", js.undefined)
    }
  }
}
