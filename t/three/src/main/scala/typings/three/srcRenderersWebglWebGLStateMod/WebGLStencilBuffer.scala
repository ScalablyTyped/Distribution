package typings.three.srcRenderersWebglWebGLStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLStencilBuffer")
@js.native
class WebGLStencilBuffer () extends js.Object {
  def reset(): Unit = js.native
  def setClear(stencil: Double): Unit = js.native
  def setFunc(stencilFunc: Double, stencilRef: Double, stencilMask: Double): Unit = js.native
  def setLocked(lock: Boolean): Unit = js.native
  def setMask(stencilMask: Double): Unit = js.native
  def setOp(stencilFail: Double, stencilZFail: Double, stencilZPass: Double): Unit = js.native
  def setTest(stencilTest: Boolean): Unit = js.native
}

