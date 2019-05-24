package typings
package threeLib.srcRenderersWebglWebGLStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLStencilBuffer")
@js.native
class WebGLStencilBuffer () extends js.Object {
  def reset(): scala.Unit = js.native
  def setClear(stencil: scala.Double): scala.Unit = js.native
  def setFunc(stencilFunc: scala.Double, stencilRef: scala.Double, stencilMask: scala.Double): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(stencilMask: scala.Double): scala.Unit = js.native
  def setOp(stencilFail: scala.Double, stencilZFail: scala.Double, stencilZPass: scala.Double): scala.Unit = js.native
  def setTest(stencilTest: scala.Boolean): scala.Unit = js.native
}

