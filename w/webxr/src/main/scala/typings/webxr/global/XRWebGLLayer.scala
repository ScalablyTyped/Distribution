package typings.webxr.global

import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.webxr.XRWebGLLayerInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer which provides a WebGL framebuffer to render into, enabling hardware accelerated
  * rendering of 3D graphics to be presented on the XR device. *
  * ref: https://immersive-web.github.io/webxr/#xrwebgllayer-interface
  */
@JSGlobal("XRWebGLLayer")
@js.native
open class XRWebGLLayer protected ()
  extends StObject
     with typings.webxr.XRWebGLLayer {
  def this(session: typings.webxr.XRSession, context: WebGL2RenderingContext) = this()
  def this(session: typings.webxr.XRSession, context: WebGLRenderingContext) = this()
  def this(session: typings.webxr.XRSession, context: WebGL2RenderingContext, layerInit: XRWebGLLayerInit) = this()
  def this(session: typings.webxr.XRSession, context: WebGLRenderingContext, layerInit: XRWebGLLayerInit) = this()
}
object XRWebGLLayer {
  
  @JSGlobal("XRWebGLLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getNativeFramebufferScaleFactor(session: typings.webxr.XRSession): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFramebufferScaleFactor")(session.asInstanceOf[js.Any]).asInstanceOf[Double]
}
