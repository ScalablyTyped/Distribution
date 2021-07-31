package typings.three

import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLIndexedBufferRendererMod {
  
  @JSImport("three/src/renderers/webgl/WebGLIndexedBufferRenderer", "WebGLIndexedBufferRenderer")
  @js.native
  class WebGLIndexedBufferRenderer protected () extends StObject {
    def this(gl: WebGLRenderingContext, extensions: js.Any, info: js.Any, capabilities: js.Any) = this()
    
    def render(start: js.Any, count: Double): Unit = js.native
    
    def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native
    
    def setIndex(index: js.Any): Unit = js.native
    
    def setMode(value: js.Any): Unit = js.native
  }
}
