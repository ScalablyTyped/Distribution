package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AzureSpnOperationStatus extends js.Object {
  var state: java.lang.String
  var statusMessage: java.lang.String
}

object AzureSpnOperationStatus {
  @scala.inline
  def apply(state: java.lang.String, statusMessage: java.lang.String): AzureSpnOperationStatus = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("state")(state)
    __obj.updateDynamic("statusMessage")(statusMessage)
    __obj.asInstanceOf[AzureSpnOperationStatus]
  }
}

