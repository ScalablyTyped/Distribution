package typings.three.srcRenderersWebglWebGLClippingMod

import typings.three.Anon_NeedsUpdate
import typings.three.srcCamerasCameraMod.Camera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three/src/renderers/webgl/WebGLClipping", "WebGLClipping")
@js.native
class WebGLClipping () extends js.Object {
  var numPlanes: Double = js.native
  var uniform: Anon_NeedsUpdate = js.native
  def beginShadows(): Unit = js.native
  def endShadows(): Unit = js.native
  def init(planes: js.Array[_], enableLocalClipping: Boolean, camera: Camera): Boolean = js.native
  def setState(planes: js.Array[_], clipShadows: Boolean, camera: Camera, cache: Boolean, fromCache: Boolean): Unit = js.native
}

