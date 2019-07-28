package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(machineGroupReference = machineGroupReference, machines = machines)
  
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
}

