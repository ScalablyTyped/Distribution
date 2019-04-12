package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "PerspectiveCamera")
@js.native
/**
  * @param fov Camera frustum vertical field of view. Default value is 50.
  * @param aspect Camera frustum aspect ratio. Default value is 1.
  * @param near Camera frustum near plane. Default value is 0.1.
  * @param far Camera frustum far plane. Default value is 2000.
  */
class PerspectiveCamera ()
  extends threeLib.srcCamerasPerspectiveCameraMod.PerspectiveCamera {
  def this(fov: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double, near: scala.Double) = this()
  def this(fov: scala.Double, aspect: scala.Double, near: scala.Double, far: scala.Double) = this()
}

