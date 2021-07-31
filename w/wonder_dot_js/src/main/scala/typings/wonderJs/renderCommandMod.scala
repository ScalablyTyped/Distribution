package typings.wonderJs

import typings.wonderJs.arrayBufferMod.ArrayBuffer
import typings.wonderJs.edrawmodeMod.EDrawMode
import typings.wonderJs.elementBufferMod.ElementBuffer
import typings.wonderJs.webGLStateMod.WebGLState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderCommandMod {
  
  @JSImport("wonder.js/dist/es2015/renderer/command/RenderCommand", "RenderCommand")
  @js.native
  abstract class RenderCommand () extends StObject {
    
    def dispose(): Unit = js.native
    
    /* protected */ def drawArray(vertexBuffer: ArrayBuffer): Unit = js.native
    
    /* protected */ def drawElements(indexBuffer: ElementBuffer): Unit = js.native
    
    var drawMode: EDrawMode = js.native
    
    def execute(): Unit = js.native
    
    def init(): Unit = js.native
    
    var webglState: WebGLState = js.native
  }
}
