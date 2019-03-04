package typings
package threeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepth extends js.Object {
  var color: threeLib.threeDashCoreMod.WebGLColorBuffer
  var depth: threeLib.threeDashCoreMod.WebGLDepthBuffer
  var stencil: threeLib.threeDashCoreMod.WebGLStencilBuffer
}

object Anon_ColorDepth {
  @scala.inline
  def apply(
    color: threeLib.threeDashCoreMod.WebGLColorBuffer,
    depth: threeLib.threeDashCoreMod.WebGLDepthBuffer,
    stencil: threeLib.threeDashCoreMod.WebGLStencilBuffer
  ): Anon_ColorDepth = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, stencil = stencil)
  
    __obj.asInstanceOf[Anon_ColorDepth]
  }
}

