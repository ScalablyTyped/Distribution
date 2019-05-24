package typings
package threeLib.srcRenderersWebglWebGLStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLState", "WebGLDepthBuffer")
@js.native
class WebGLDepthBuffer () extends js.Object {
  def reset(): scala.Unit = js.native
  def setClear(depth: scala.Double): scala.Unit = js.native
  def setFunc(depthFunc: threeLib.srcConstantsMod.DepthModes): scala.Unit = js.native
  def setLocked(lock: scala.Boolean): scala.Unit = js.native
  def setMask(depthMask: scala.Boolean): scala.Unit = js.native
  def setTest(depthTest: scala.Boolean): scala.Unit = js.native
}

