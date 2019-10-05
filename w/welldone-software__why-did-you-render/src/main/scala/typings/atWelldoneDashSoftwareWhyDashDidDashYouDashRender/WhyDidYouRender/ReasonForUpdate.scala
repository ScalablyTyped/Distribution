package typings.atWelldoneDashSoftwareWhyDashDidDashYouDashRender.WhyDidYouRender

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReasonForUpdate extends js.Object {
  var hookDifferences: Boolean
  var propsDifferences: Boolean
  var stateDifferences: Boolean
}

object ReasonForUpdate {
  @scala.inline
  def apply(hookDifferences: Boolean, propsDifferences: Boolean, stateDifferences: Boolean): ReasonForUpdate = {
    val __obj = js.Dynamic.literal(hookDifferences = hookDifferences, propsDifferences = propsDifferences, stateDifferences = stateDifferences)
  
    __obj.asInstanceOf[ReasonForUpdate]
  }
}

