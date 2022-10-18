package typings.wonderJs

import typings.wonderJs.distEs2015RendererCommandRenderCommandMod.RenderCommand
import typings.wonderJs.distEs2015RendererStateWebGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015RendererRendererRendererMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/renderer/renderer/Renderer", "Renderer")
  @js.native
  open class Renderer () extends StObject {
    
    def addCommand(command: RenderCommand): Unit = js.native
    
    def clear(): Unit = js.native
    
    def hasCommand(): Boolean = js.native
    
    def init(): Unit = js.native
    
    def render(): Unit = js.native
    
    var webglState: WebGLState = js.native
  }
}
