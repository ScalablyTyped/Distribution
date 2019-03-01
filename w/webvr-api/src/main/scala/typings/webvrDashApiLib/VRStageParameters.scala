package typings
package webvrDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VRStageParameters extends js.Object {
  var sittingToStandingTransform: js.UndefOr[stdLib.Float32Array] = js.undefined
  var sizeX: js.UndefOr[scala.Double] = js.undefined
  var sizeY: js.UndefOr[scala.Double] = js.undefined
}

object VRStageParameters {
  @scala.inline
  def apply(
    sittingToStandingTransform: stdLib.Float32Array = null,
    sizeX: scala.Int | scala.Double = null,
    sizeY: scala.Int | scala.Double = null
  ): VRStageParameters = {
    val __obj = js.Dynamic.literal()
    if (sittingToStandingTransform != null) __obj.updateDynamic("sittingToStandingTransform")(sittingToStandingTransform)
    if (sizeX != null) __obj.updateDynamic("sizeX")(sizeX.asInstanceOf[js.Any])
    if (sizeY != null) __obj.updateDynamic("sizeY")(sizeY.asInstanceOf[js.Any])
    __obj.asInstanceOf[VRStageParameters]
  }
}

