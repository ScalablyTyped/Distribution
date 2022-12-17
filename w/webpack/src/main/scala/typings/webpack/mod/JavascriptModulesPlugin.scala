package typings.webpack.mod

import typings.webpack.anon.AfterStartup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webpack", "JavascriptModulesPlugin")
@js.native
open class JavascriptModulesPlugin () extends StObject {
  def this(options: js.Object) = this()
  
  /**
  	 * Apply the plugin
  	 */
  @JSName("apply")
  def apply(compiler: Compiler): Unit = js.native
  
  var options: js.Object = js.native
  
  def renderBootstrap(renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): AfterStartup = js.native
  
  def renderChunk(renderContext: RenderContext, hooks: CompilationHooksJavascriptModulesPlugin): Source = js.native
  
  def renderMain(
    renderContext: MainRenderContext,
    hooks: CompilationHooksJavascriptModulesPlugin,
    compilation: Compilation
  ): Source = js.native
  
  def renderModule(
    module: Module,
    renderContext: ChunkRenderContext,
    hooks: CompilationHooksJavascriptModulesPlugin,
    factory: Boolean
  ): Source = js.native
  
  def renderRequire(renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): String = js.native
  
  def updateHashWithBootstrap(hash: Hash, renderContext: RenderBootstrapContext, hooks: CompilationHooksJavascriptModulesPlugin): Unit = js.native
}
object JavascriptModulesPlugin {
  
  @JSImport("webpack", "JavascriptModulesPlugin")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("webpack", "JavascriptModulesPlugin.chunkHasJs")
  @js.native
  def chunkHasJs: js.Function2[/* chunk */ Chunk, /* chunkGraph */ ChunkGraph, Boolean] = js.native
  inline def chunkHasJs_=(x: js.Function2[/* chunk */ Chunk, /* chunkGraph */ ChunkGraph, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("chunkHasJs")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def getChunkFilenameTemplate(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChunkFilenameTemplate")().asInstanceOf[Any]
  inline def getChunkFilenameTemplate(chunk: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChunkFilenameTemplate")(chunk.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getChunkFilenameTemplate(chunk: Any, outputOptions: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunkFilenameTemplate")(chunk.asInstanceOf[js.Any], outputOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getChunkFilenameTemplate(chunk: Unit, outputOptions: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunkFilenameTemplate")(chunk.asInstanceOf[js.Any], outputOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getCompilationHooks(compilation: Compilation): CompilationHooksJavascriptModulesPlugin = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompilationHooks")(compilation.asInstanceOf[js.Any]).asInstanceOf[CompilationHooksJavascriptModulesPlugin]
}
