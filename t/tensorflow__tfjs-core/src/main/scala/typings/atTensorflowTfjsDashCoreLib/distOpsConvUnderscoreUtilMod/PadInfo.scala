package typings
package atTensorflowTfjsDashCoreLib.distOpsConvUnderscoreUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PadInfo extends js.Object {
  var bottom: scala.Double
  var left: scala.Double
  var right: scala.Double
  var top: scala.Double
  var `type`: java.lang.String
}

object PadInfo {
  @scala.inline
  def apply(
    bottom: scala.Double,
    left: scala.Double,
    right: scala.Double,
    top: scala.Double,
    `type`: java.lang.String
  ): PadInfo = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, right = right, top = top)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[PadInfo]
  }
}

