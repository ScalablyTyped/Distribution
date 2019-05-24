package typings
package threeLib.srcRenderersWebglWebGLStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLColorBuffer")
@js.native
class WebGLColorBuffer () extends js.Object {
  def reset(): scala.Unit = js.native
  def setClear(
    r: scala.Double,
    g: scala.Double,
    b: scala.Double,
    a: scala.Double,
    premultipliedAlpha: scala.Boolean
  ): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(colorMask: scala.Boolean): scala.Unit = js.native
}

