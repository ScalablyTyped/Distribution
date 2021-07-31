package typings.webxr.mod

import typings.std.WebGL2RenderingContext
import typings.std.WebGLFramebuffer
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("webxr", "XRWebGLLayer")
@js.native
class XRWebGLLayer protected () extends StObject {
  def this(session: XRSession, context: WebGL2RenderingContext) = this()
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: WebGL2RenderingContext, layerInit: XRWebGLLayerInit) = this()
  def this(session: XRSession, context: WebGLRenderingContext, layerInit: XRWebGLLayerInit) = this()
  
  val antialias: Boolean = js.native
  
  val framebuffer: WebGLFramebuffer = js.native
  
  val framebufferHeight: Double = js.native
  
  val framebufferWidth: Double = js.native
  
  def getViewport(view: XRView): XRViewport = js.native
  
  val ignoreDepthValues: Boolean = js.native
}
/* static members */
object XRWebGLLayer {
  
  @JSImport("webxr", "XRWebGLLayer")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getNativeFramebufferScaleFactor(session: XRSession): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFramebufferScaleFactor")(session.asInstanceOf[js.Any]).asInstanceOf[Double]
}
