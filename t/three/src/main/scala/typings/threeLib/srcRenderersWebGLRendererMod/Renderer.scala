package typings
package threeLib.srcRenderersWebGLRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var domElement: stdLib.HTMLCanvasElement = js.native
  def render(scene: threeLib.srcScenesSceneMod.Scene, camera: threeLib.srcCamerasCameraMod.Camera): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double): scala.Unit = js.native
  def setSize(width: scala.Double, height: scala.Double, updateStyle: scala.Boolean): scala.Unit = js.native
}

