package typings.wonderJs

import typings.wonderJs.renderCommandMod.RenderCommand
import typings.wonderJs.webGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/renderer/Renderer", "Renderer")
  @js.native
  abstract class Renderer () extends StObject {
    
    def addCommand(command: RenderCommand): Unit = js.native
    
    def clear(): Unit = js.native
    
    def hasCommand(): Boolean = js.native
    
    def init(): Unit = js.native
    
    def render(): Unit = js.native
    
    var webglState: WebGLState = js.native
  }
}
