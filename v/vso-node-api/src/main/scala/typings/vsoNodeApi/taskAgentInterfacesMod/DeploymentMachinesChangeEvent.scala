package typings.vsoNodeApi.taskAgentInterfacesMod

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
    val __obj = js.Dynamic.literal(machineGroupReference = machineGroupReference.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
}

