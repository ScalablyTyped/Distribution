package typings.three

import typings.std.WebGLRenderingContext
import typings.three.webGLCapabilitiesMod.WebGLCapabilities
import typings.three.webGLExtensionsMod.WebGLExtensions
import typings.three.webGLInfoMod.WebGLInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webgl/WebGLBufferRenderer", JSImport.Namespace)
@js.native
object webGLBufferRendererMod extends js.Object {
  @js.native
  class WebGLBufferRenderer protected () extends js.Object {
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

