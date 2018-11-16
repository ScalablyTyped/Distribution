package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLColorBuffer")
@js.native
class WebGLColorBuffer protected () extends js.Object {
  def this(gl: js.Any, state: js.Any) = this()
  def reset(): scala.Unit = js.native
  def setClear(r: scala.Double, g: scala.Double, b: scala.Double, a: scala.Double): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(colorMask: scala.Double): scala.Unit = js.native
}

