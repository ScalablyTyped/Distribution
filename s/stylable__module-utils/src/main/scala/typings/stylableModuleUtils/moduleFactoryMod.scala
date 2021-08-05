package typings.stylableModuleUtils

import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableModuleUtils.anon.PartialOptions
import typings.stylableModuleUtils.stylableModuleUtilsStrings.module
import typings.stylableModuleUtils.stylableModuleUtilsStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleFactoryMod {
  
  @JSImport("@stylable/module-utils/cjs/module-factory", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def stylableModuleFactory(stylableOptions: StylableConfig): js.Function2[/* source */ String, /* path */ String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("stylableModuleFactory")(stylableOptions.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  inline def stylableModuleFactory(
    stylableOptions: StylableConfig,
    hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports: PartialOptions
  ): js.Function2[/* source */ String, /* path */ String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("stylableModuleFactory")(stylableOptions.asInstanceOf[js.Any], hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* source */ String, /* path */ String, String]]
  
  trait Options extends StObject {
    
    var injectCSS: Boolean
    
    var renderableOnly: Boolean
    
    var runtimePath: String
    
    var runtimeStylesheetId: module | namespace
    
    var staticImports: js.Array[String]
  }
  object Options {
    
    inline def apply(
      injectCSS: Boolean,
      renderableOnly: Boolean,
      runtimePath: String,
      runtimeStylesheetId: module | namespace,
      staticImports: js.Array[String]
    ): Options = {
      val __obj = js.Dynamic.literal(injectCSS = injectCSS.asInstanceOf[js.Any], renderableOnly = renderableOnly.asInstanceOf[js.Any], runtimePath = runtimePath.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any], staticImports = staticImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setInjectCSS(value: Boolean): Self = StObject.set(x, "injectCSS", value.asInstanceOf[js.Any])
      
      inline def setRenderableOnly(value: Boolean): Self = StObject.set(x, "renderableOnly", value.asInstanceOf[js.Any])
      
      inline def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      inline def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
      
      inline def setStaticImports(value: js.Array[String]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      inline def setStaticImportsVarargs(value: String*): Self = StObject.set(x, "staticImports", js.Array(value :_*))
    }
  }
}
