package typings.webxr

import typings.std.EventTarget
import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A layer which provides a WebGL framebuffer to render into, enabling hardware accelerated
  * rendering of 3D graphics to be presented on the XR device. *
  * ref: https://immersive-web.github.io/webxr/#xrwebgllayer-interface
  */
@js.native
trait XRWebGLLayer
  extends StObject
     with EventTarget {
  
  val antialias: Boolean = js.native
  
  var fixedFoveation: js.UndefOr[Double] = js.native
  
  val framebuffer: WebGLFramebuffer = js.native
  
  val framebufferHeight: Double = js.native
  
  val framebufferWidth: Double = js.native
  
  def getViewport(view: XRView): js.UndefOr[XRViewport] = js.native
  
  val ignoreDepthValues: Boolean = js.native
}
