package typings.three

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLIndexedBufferRendererMod {
  
  @JSImport("three/src/renderers/webgl/WebGLIndexedBufferRenderer", "WebGLIndexedBufferRenderer")
  @js.native
  open class WebGLIndexedBufferRenderer protected () extends StObject {
    def this(gl: WebGLRenderingContext, extensions: Any, info: Any, capabilities: Any) = this()
    
    def render(start: Any, count: Double): Unit = js.native
    
    def renderInstances(start: Any, count: Double, primcount: Double): Unit = js.native
    
    def setIndex(index: Any): Unit = js.native
    
    def setMode(value: Any): Unit = js.native
  }
}
