package typings.three.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "OrthographicCamera")
@js.native
class OrthographicCamera protected ()
  extends typings.three.srcCamerasOrthographicCameraMod.OrthographicCamera {
  /**
  	 * @param left Camera frustum left plane.
  	 * @param right Camera frustum right plane.
  	 * @param top Camera frustum top plane.
  	 * @param bottom Camera frustum bottom plane.
  	 * @param near Camera frustum near plane.
  	 * @param far Camera frustum far plane.
  	 */
  def this(left: Double, right: Double, top: Double, bottom: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double) = this()
  def this(left: Double, right: Double, top: Double, bottom: Double, near: Double, far: Double) = this()
}

