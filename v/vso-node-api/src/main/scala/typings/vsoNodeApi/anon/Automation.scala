package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Automation extends js.Object {
  var automation: scala.Double
  var deployment: scala.Double
}

object Automation {
  @scala.inline
  def apply(automation: scala.Double, deployment: scala.Double): Automation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automation]
  }
}

