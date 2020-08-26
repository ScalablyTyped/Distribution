package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentMachinesChangeEvent extends js.Object {
  var machineGroupReference: DeploymentGroupReference = js.native
  var machines: js.Array[DeploymentMachine] = js.native
}

object DeploymentMachinesChangeEvent {
  @scala.inline
  def apply(machineGroupReference: DeploymentGroupReference, machines: js.Array[DeploymentMachine]): DeploymentMachinesChangeEvent = {
    val __obj = js.Dynamic.literal(machineGroupReference = machineGroupReference.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
  @scala.inline
  implicit class DeploymentMachinesChangeEventOps[Self <: DeploymentMachinesChangeEvent] (val x: Self) extends AnyVal {
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
    def setMachineGroupReference(value: DeploymentGroupReference): Self = this.set("machineGroupReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setMachinesVarargs(value: DeploymentMachine*): Self = this.set("machines", js.Array(value :_*))
    @scala.inline
    def setMachines(value: js.Array[DeploymentMachine]): Self = this.set("machines", value.asInstanceOf[js.Any])
  }
  
}

