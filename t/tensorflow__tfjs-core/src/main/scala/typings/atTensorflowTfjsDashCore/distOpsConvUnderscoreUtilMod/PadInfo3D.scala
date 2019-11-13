package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadInfo3D extends js.Object {
  var back: Double
  var bottom: Double
  var front: Double
  var left: Double
  var right: Double
  var top: Double
  var `type`: PadType
}

object PadInfo3D {
  @scala.inline
  def apply(
    back: Double,
    bottom: Double,
    front: Double,
    left: Double,
    right: Double,
    top: Double,
    `type`: PadType
  ): PadInfo3D = {
    val __obj = js.Dynamic.literal(back = back, bottom = bottom, front = front, left = left, right = right, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PadInfo3D]
  }
}

