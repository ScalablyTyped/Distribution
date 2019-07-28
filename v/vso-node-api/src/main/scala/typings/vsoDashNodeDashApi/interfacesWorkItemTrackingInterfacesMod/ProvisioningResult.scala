package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProvisioningResult extends js.Object {
  /**
    * Details about of the provisioning import events.
    */
  var provisioningImportEvents: js.Array[String]
}

object ProvisioningResult {
  @scala.inline
  def apply(provisioningImportEvents: js.Array[String]): ProvisioningResult = {
    val __obj = js.Dynamic.literal(provisioningImportEvents = provisioningImportEvents)
  
    __obj.asInstanceOf[ProvisioningResult]
  }
}

