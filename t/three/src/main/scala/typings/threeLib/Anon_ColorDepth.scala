package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepth extends js.Object {
  var color: threeLib.srcRenderersWebglWebGLStateMod.WebGLColorBuffer
  var depth: threeLib.srcRenderersWebglWebGLStateMod.WebGLDepthBuffer
  var stencil: threeLib.srcRenderersWebglWebGLStateMod.WebGLStencilBuffer
}

object Anon_ColorDepth {
  @scala.inline
  def apply(
    color: threeLib.srcRenderersWebglWebGLStateMod.WebGLColorBuffer,
    depth: threeLib.srcRenderersWebglWebGLStateMod.WebGLDepthBuffer,
    stencil: threeLib.srcRenderersWebglWebGLStateMod.WebGLStencilBuffer
  ): Anon_ColorDepth = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, stencil = stencil)
  
    __obj.asInstanceOf[Anon_ColorDepth]
  }
}

