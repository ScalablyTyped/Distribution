package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProvisioningResult extends js.Object {
  /**
    * Details about of the provisioning import events.
    */
  var provisioningImportEvents: js.Array[String] = js.native
}

object ProvisioningResult {
  @scala.inline
  def apply(provisioningImportEvents: js.Array[String]): ProvisioningResult = {
    val __obj = js.Dynamic.literal(provisioningImportEvents = provisioningImportEvents.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProvisioningResult]
  }
  @scala.inline
  implicit class ProvisioningResultOps[Self <: ProvisioningResult] (val x: Self) extends AnyVal {
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
    def setProvisioningImportEventsVarargs(value: String*): Self = this.set("provisioningImportEvents", js.Array(value :_*))
    @scala.inline
    def setProvisioningImportEvents(value: js.Array[String]): Self = this.set("provisioningImportEvents", value.asInstanceOf[js.Any])
  }
  
}

