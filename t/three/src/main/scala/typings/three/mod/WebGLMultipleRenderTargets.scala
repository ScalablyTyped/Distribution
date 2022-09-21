package typings.three.mod

import typings.three.webGLRenderTargetMod.WebGLRenderTargetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("three", "WebGLMultipleRenderTargets")
@js.native
open class WebGLMultipleRenderTargets protected ()
  extends typings.three.threeMod.WebGLMultipleRenderTargets {
  /**
    * @param width The width of the render target.
    * @param height The height of the render target.
    * @param count The number of render targets.
    * @param options object that holds texture parameters for an auto-generated target texture and depthBuffer/stencilBuffer booleans.
    * For an explanation of the texture parameters see {@link Texture}.
    */
  def this(width: Double, height: Double, count: Double) = this()
  def this(width: Double, height: Double, count: Double, options: WebGLRenderTargetOptions) = this()
}
