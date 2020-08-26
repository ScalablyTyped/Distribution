package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Automation extends js.Object {
  var automation: scala.Double = js.native
  var deployment: scala.Double = js.native
}

object Automation {
  @scala.inline
  def apply(automation: scala.Double, deployment: scala.Double): Automation = {
    val __obj = js.Dynamic.literal(automation = automation.asInstanceOf[js.Any], deployment = deployment.asInstanceOf[js.Any])
    __obj.asInstanceOf[Automation]
  }
  @scala.inline
  implicit class AutomationOps[Self <: Automation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomation(value: scala.Double): Self = this.set("automation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeployment(value: scala.Double): Self = this.set("deployment", value.asInstanceOf[js.Any])
  }
  
}

