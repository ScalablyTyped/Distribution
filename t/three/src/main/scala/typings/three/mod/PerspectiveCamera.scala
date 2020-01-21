package typings.three.mod

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
  extends typings.three.perspectiveCameraMod.PerspectiveCamera {
  def this(fov: Double) = this()
  def this(fov: Double, aspect: Double) = this()
  def this(fov: Double, aspect: Double, near: Double) = this()
  def this(fov: Double, aspect: Double, near: Double, far: Double) = this()
}

