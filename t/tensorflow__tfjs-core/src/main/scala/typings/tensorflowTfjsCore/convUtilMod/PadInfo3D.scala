package typings.tensorflowTfjsCore.convUtilMod

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
    val __obj = js.Dynamic.literal(back = back.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], front = front.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadInfo3D]
  }
}

