package typings
package wonderDotJsLib.distEs2015ComponentCameraPerspectiveCameraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/component/camera/PerspectiveCamera", "PerspectiveCamera")
@js.native
class PerspectiveCamera ()
  extends wonderDotJsLib.distEs2015ComponentCameraCameraMod.Camera {
  var aspect: scala.Double = js.native
  var fovy: scala.Double = js.native
  def zoomIn(speed: scala.Double): scala.Unit = js.native
  def zoomIn(speed: scala.Double, min: scala.Double): scala.Unit = js.native
  def zoomOut(speed: scala.Double): scala.Unit = js.native
  def zoomOut(speed: scala.Double, max: scala.Double): scala.Unit = js.native
}

@JSImport("wonder.js/dist/es2015/component/camera/PerspectiveCamera", "PerspectiveCamera")
@js.native
object PerspectiveCamera extends js.Object {
  def create(): wonderDotJsLib.distEs2015ComponentCameraPerspectiveCameraMod.PerspectiveCamera = js.native
}

