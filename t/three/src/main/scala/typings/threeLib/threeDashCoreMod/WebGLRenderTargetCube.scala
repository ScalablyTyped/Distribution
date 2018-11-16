package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLRenderTargetCube")
@js.native
class WebGLRenderTargetCube protected () extends WebGLRenderTarget {
  def this(width: scala.Double, height: scala.Double) = this()
  def this(width: scala.Double, height: scala.Double, options: WebGLRenderTargetOptions) = this()
  var activeCubeFace: scala.Double = js.native
   // PX 0, NX 1, PY 2, NY 3, PZ 4, NZ 5
  var activeMipMapLevel: scala.Double = js.native
}

