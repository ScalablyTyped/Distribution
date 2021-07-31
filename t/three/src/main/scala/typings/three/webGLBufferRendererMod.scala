package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLInfoMod.WebGLInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webGLBufferRendererMod {
  
  @JSImport("three/src/renderers/webgl/WebGLBufferRenderer", "WebGLBufferRenderer")
  @js.native
  class WebGLBufferRenderer protected () extends StObject {
    def this(
      gl: WebGLRenderingContext,
      extensions: WebGLExtensions,
      info: WebGLInfo,
      capabilities: WebGLCapabilities
    ) = this()
    
    def render(start: js.Any, count: Double): Unit = js.native
    
    def renderInstances(start: js.Any, count: Double, primcount: Double): Unit = js.native
    
    def setMode(value: js.Any): Unit = js.native
  }
}
