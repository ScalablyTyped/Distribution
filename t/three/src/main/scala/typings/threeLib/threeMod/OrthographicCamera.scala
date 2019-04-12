package typings
package threeLib.threeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("three", "OrthographicCamera")
@js.native
class OrthographicCamera protected ()
  extends threeLib.srcCamerasOrthographicCameraMod.OrthographicCamera {
  /**
    * @param left Camera frustum left plane.
    * @param right Camera frustum right plane.
    * @param top Camera frustum top plane.
    * @param bottom Camera frustum bottom plane.
    * @param near Camera frustum near plane.
    * @param far Camera frustum far plane.
    */
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double, near: scala.Double) = this()
  def this(left: scala.Double, right: scala.Double, top: scala.Double, bottom: scala.Double, near: scala.Double, far: scala.Double) = this()
}

