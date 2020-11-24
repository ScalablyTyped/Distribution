package typings.three.webXRMod

import typings.std.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three/src/renderers/webxr/WebXR", "XRWebGLLayer")
@js.native
class XRWebGLLayer protected () extends XRLayer {
  def this(session: XRSession) = this()
  def this(session: XRSession, gl: WebGLRenderingContext) = this()
  def this(session: XRSession, gl: js.UndefOr[scala.Nothing], options: XRWebGLLayerInit) = this()
  def this(session: XRSession, gl: WebGLRenderingContext, options: XRWebGLLayerInit) = this()
  
  var framebuffer: WebGLFramebuffer = js.native
  
  var framebufferHeight: Double = js.native
  
  var framebufferWidth: Double = js.native
  
  def getViewport(view: XRView): XRViewport = js.native
}
