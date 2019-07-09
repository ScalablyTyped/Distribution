package typings
package atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadInfo3D extends js.Object {
  var back: scala.Double
  var bottom: scala.Double
  var front: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
  var `type`: java.lang.String
}

object PadInfo3D {
  @scala.inline
  def apply(
    back: scala.Double,
    bottom: scala.Double,
    front: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    `type`: java.lang.String
  ): PadInfo3D = {
    val __obj = js.Dynamic.literal(back = back, bottom = bottom, front = front, left = left, right = right, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PadInfo3D]
  }
}

