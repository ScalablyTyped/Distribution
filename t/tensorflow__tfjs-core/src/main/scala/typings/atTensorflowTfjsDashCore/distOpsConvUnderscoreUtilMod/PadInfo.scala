package typings.atTensorflowTfjsDashCore.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadInfo extends js.Object {
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
  var `type`: PadType
}

object PadInfo {
  @scala.inline
  def apply(bottom: Double, left: Double, right: Double, top: Double, `type`: PadType): PadInfo = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PadInfo]
  }
}

