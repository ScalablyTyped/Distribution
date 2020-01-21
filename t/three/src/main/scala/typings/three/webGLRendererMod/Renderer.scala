package typings.three.webGLRendererMod

import typings.std.HTMLCanvasElement
import typings.three.cameraMod.Camera
import typings.three.sceneMod.Scene
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

