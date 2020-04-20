package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutomation extends js.Object {
  var automation: Double
  var deployment: Double
}

object AnonAutomation {
  @scala.inline
  def apply(automation: Double, deployment: Double): AnonAutomation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutomation]
  }
}

