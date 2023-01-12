package typings.webpack.mod

import typings.tapable.mod.SyncWaterfallHook
import typings.tapable.mod.UnsetAdditionalOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompilationHooksAsyncWebAssemblyModulesPlugin extends StObject {
  
  var renderModuleContent: SyncWaterfallHook[js.Tuple3[Source, Module, WebAssemblyRenderContext], UnsetAdditionalOptions]
}
object CompilationHooksAsyncWebAssemblyModulesPlugin {
  
  inline def apply(
    renderModuleContent: SyncWaterfallHook[js.Tuple3[Source, Module, WebAssemblyRenderContext], UnsetAdditionalOptions]
  ): CompilationHooksAsyncWebAssemblyModulesPlugin = {
    val __obj = js.Dynamic.literal(renderModuleContent = renderModuleContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompilationHooksAsyncWebAssemblyModulesPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompilationHooksAsyncWebAssemblyModulesPlugin] (val x: Self) extends AnyVal {
    
    inline def setRenderModuleContent(
      value: SyncWaterfallHook[js.Tuple3[Source, Module, WebAssemblyRenderContext], UnsetAdditionalOptions]
    ): Self = StObject.set(x, "renderModuleContent", value.asInstanceOf[js.Any])
  }
}
