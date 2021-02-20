package typings.stylableModuleUtils

import typings.stylableCore.stylableMod.StylableConfig
import typings.stylableModuleUtils.anon.PartialOptions
import typings.stylableModuleUtils.stylableModuleUtilsStrings.module
import typings.stylableModuleUtils.stylableModuleUtilsStrings.namespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object moduleFactoryMod {
  
  @JSImport("@stylable/module-utils/cjs/module-factory", "stylableModuleFactory")
  @js.native
  def stylableModuleFactory(stylableOptions: StylableConfig): js.Function2[/* source */ String, /* path */ String, String] = js.native
  @JSImport("@stylable/module-utils/cjs/module-factory", "stylableModuleFactory")
  @js.native
  def stylableModuleFactory(
    stylableOptions: StylableConfig,
    hasRuntimePathRuntimeStylesheetIdInjectCSSRenderableOnlyStaticImports: PartialOptions
  ): js.Function2[/* source */ String, /* path */ String, String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    var injectCSS: Boolean = js.native
    
    var renderableOnly: Boolean = js.native
    
    var runtimePath: String = js.native
    
    var runtimeStylesheetId: module | namespace = js.native
    
    var staticImports: js.Array[String] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(
      injectCSS: Boolean,
      renderableOnly: Boolean,
      runtimePath: String,
      runtimeStylesheetId: module | namespace,
      staticImports: js.Array[String]
    ): Options = {
      val __obj = js.Dynamic.literal(injectCSS = injectCSS.asInstanceOf[js.Any], renderableOnly = renderableOnly.asInstanceOf[js.Any], runtimePath = runtimePath.asInstanceOf[js.Any], runtimeStylesheetId = runtimeStylesheetId.asInstanceOf[js.Any], staticImports = staticImports.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInjectCSS(value: Boolean): Self = StObject.set(x, "injectCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderableOnly(value: Boolean): Self = StObject.set(x, "renderableOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimePath(value: String): Self = StObject.set(x, "runtimePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuntimeStylesheetId(value: module | namespace): Self = StObject.set(x, "runtimeStylesheetId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticImports(value: js.Array[String]): Self = StObject.set(x, "staticImports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticImportsVarargs(value: String*): Self = StObject.set(x, "staticImports", js.Array(value :_*))
    }
  }
}
