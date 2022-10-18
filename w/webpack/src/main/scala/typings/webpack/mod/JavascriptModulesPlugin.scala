package typings.webpack.mod

import typings.webpack.anon.AfterStartup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JavascriptModulesPlugin extends StObject {
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit
  
  var options: js.Object
  
  def renderBootstrap(renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): AfterStartup
  
  def renderChunk(renderContext: RenderContext, hooks: CompilationHooksJavascriptModulesPlugin): Source
  
  def renderMain(
    renderContext: MainRenderContext,
    hooks: CompilationHooksJavascriptModulesPlugin,
    compilation: Compilation
  ): Source
  
  def renderModule(
    module: Module,
    renderContext: ChunkRenderContext,
    hooks: CompilationHooksJavascriptModulesPlugin,
    factory: Boolean
  ): Source
  
  def renderRequire(renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): String
  
  def updateHashWithBootstrap(hash: Hash, renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): Unit
}
object JavascriptModulesPlugin {
  
  inline def apply(
    apply: Compiler => Unit,
    options: js.Object,
    renderBootstrap: (RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => AfterStartup,
    renderChunk: (RenderContext, CompilationHooksJavascriptModulesPlugin) => Source,
    renderMain: (MainRenderContext, CompilationHooksJavascriptModulesPlugin, Compilation) => Source,
    renderModule: (Module, ChunkRenderContext, CompilationHooksJavascriptModulesPlugin, Boolean) => Source,
    renderRequire: (RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => String,
    updateHashWithBootstrap: (Hash, RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => Unit
  ): JavascriptModulesPlugin = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply), options = options.asInstanceOf[js.Any], renderBootstrap = js.Any.fromFunction2(renderBootstrap), renderChunk = js.Any.fromFunction2(renderChunk), renderMain = js.Any.fromFunction3(renderMain), renderModule = js.Any.fromFunction4(renderModule), renderRequire = js.Any.fromFunction2(renderRequire), updateHashWithBootstrap = js.Any.fromFunction3(updateHashWithBootstrap))
    __obj.asInstanceOf[JavascriptModulesPlugin]
  }
  
  extension [Self <: JavascriptModulesPlugin](x: Self) {
    
    inline def setApply(value: Compiler => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
    
    inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRenderBootstrap(value: (RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => AfterStartup): Self = StObject.set(x, "renderBootstrap", js.Any.fromFunction2(value))
    
    inline def setRenderChunk(value: (RenderContext, CompilationHooksJavascriptModulesPlugin) => Source): Self = StObject.set(x, "renderChunk", js.Any.fromFunction2(value))
    
    inline def setRenderMain(value: (MainRenderContext, CompilationHooksJavascriptModulesPlugin, Compilation) => Source): Self = StObject.set(x, "renderMain", js.Any.fromFunction3(value))
    
    inline def setRenderModule(value: (Module, ChunkRenderContext, CompilationHooksJavascriptModulesPlugin, Boolean) => Source): Self = StObject.set(x, "renderModule", js.Any.fromFunction4(value))
    
    inline def setRenderRequire(value: (RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => String): Self = StObject.set(x, "renderRequire", js.Any.fromFunction2(value))
    
    inline def setUpdateHashWithBootstrap(value: (Hash, RenderBootstrapContext, CompilationHooksJavascriptModulesPlugin) => Unit): Self = StObject.set(x, "updateHashWithBootstrap", js.Any.fromFunction3(value))
  }
}
