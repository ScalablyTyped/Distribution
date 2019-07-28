package typings.three.srcRenderersWebglWebGLStateMod

import typings.three.srcConstantsMod.DepthModes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLDepthBuffer")
@js.native
class WebGLDepthBuffer () extends js.Object {
  def reset(): Unit = js.native
  def setClear(depth: Double): Unit = js.native
  def setFunc(depthFunc: DepthModes): Unit = js.native
  def setLocked(lock: Boolean): Unit = js.native
  def setMask(depthMask: Boolean): Unit = js.native
  def setTest(depthTest: Boolean): Unit = js.native
}

