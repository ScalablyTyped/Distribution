package typings.three.srcRenderersWebGLRendererMod

import typings.std.HTMLCanvasElement
import typings.three.srcCamerasCameraMod.Camera
import typings.three.srcScenesSceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Renderer extends js.Object {
  var domElement: HTMLCanvasElement = js.native
  def render(scene: Scene, camera: Camera): Unit = js.native
  def setSize(width: Double, height: Double): Unit = js.native
  def setSize(width: Double, height: Double, updateStyle: Boolean): Unit = js.native
}

