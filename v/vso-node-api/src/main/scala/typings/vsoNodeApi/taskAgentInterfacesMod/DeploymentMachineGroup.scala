package typings.vsoNodeApi.taskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentMachineGroup extends DeploymentMachineGroupReference {
  
  var machines: js.Array[DeploymentMachine] = js.native
  
  var size: Double = js.native
}
object DeploymentMachineGroup {
  
  @scala.inline
  def apply(
    id: Double,
    machines: js.Array[DeploymentMachine],
    name: String,
    pool: TaskAgentPoolReference,
    project: ProjectReference,
    size: Double
  ): DeploymentMachineGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachineGroup]
  }
  
  @scala.inline
  implicit class DeploymentMachineGroupOps[Self <: DeploymentMachineGroup] (val x: Self) extends AnyVal {
    
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
    def setMachinesVarargs(value: DeploymentMachine*): Self = this.set("machines", js.Array(value :_*))
    
    @scala.inline
    def setMachines(value: js.Array[DeploymentMachine]): Self = this.set("machines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
