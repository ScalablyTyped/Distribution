package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLDepthBuffer")
@js.native
class WebGLDepthBuffer protected () extends js.Object {
  def this(gl: js.Any, state: js.Any) = this()
  def reset(): scala.Unit = js.native
  def setClear(depth: js.Any): scala.Unit = js.native
  def setFunc(depthFunc: scala.Double): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(depthMask: scala.Double): scala.Unit = js.native
  def setTest(depthTest: scala.Boolean): scala.Unit = js.native
}

