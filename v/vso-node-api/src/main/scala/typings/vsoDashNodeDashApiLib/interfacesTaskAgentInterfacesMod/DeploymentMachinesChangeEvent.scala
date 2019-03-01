package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentMachinesChangeEvent extends js.Object {
  var machineGroupReference: DeploymentGroupReference
  var machines: js.Array[DeploymentMachine]
}

object DeploymentMachinesChangeEvent {
  @scala.inline
  def apply(machineGroupReference: DeploymentGroupReference, machines: js.Array[DeploymentMachine]): DeploymentMachinesChangeEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("machineGroupReference")(machineGroupReference)
    __obj.updateDynamic("machines")(machines)
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
}

