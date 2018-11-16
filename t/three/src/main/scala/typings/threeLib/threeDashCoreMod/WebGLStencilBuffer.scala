package typings
package threeLib.threeDashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/three-core", "WebGLStencilBuffer")
@js.native
class WebGLStencilBuffer protected () extends js.Object {
  def this(gl: js.Any, state: js.Any) = this()
  def reset(): scala.Unit = js.native
  def setClear(stencil: js.Any): scala.Unit = js.native
  def setFunc(stencilFunc: scala.Double, stencilRef: js.Any, stencilMask: scala.Double): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(stencilMask: scala.Double): scala.Unit = js.native
  def setOp(stencilFail: js.Any, stencilZFail: js.Any, stencilZPass: js.Any): scala.Unit = js.native
  def setTest(stencilTest: scala.Boolean): scala.Unit = js.native
}

