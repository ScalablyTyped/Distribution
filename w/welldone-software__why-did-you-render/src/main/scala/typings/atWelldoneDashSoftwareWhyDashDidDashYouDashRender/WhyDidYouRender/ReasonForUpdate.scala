package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReasonForUpdate extends js.Object {
  var hookDifferences: js.Array[HookDifference]
  var propsDifferences: Boolean
  var stateDifferences: Boolean
}

object ReasonForUpdate {
  @scala.inline
  def apply(hookDifferences: js.Array[HookDifference], propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
    val __obj = js.Dynamic.literal(hookDifferences = hookDifferences.asInstanceOf[js.Any], propsDifferences = propsDifferences.asInstanceOf[js.Any], stateDifferences = stateDifferences.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReasonForUpdate]
  }
}

