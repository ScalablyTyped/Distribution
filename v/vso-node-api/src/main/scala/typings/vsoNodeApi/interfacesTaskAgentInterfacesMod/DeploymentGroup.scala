package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentGroup
  extends StObject
     with DeploymentGroupReference {
  
  var machineCount: Double
  
  var machines: js.Array[DeploymentMachine]
}
object DeploymentGroup {
  
  inline def apply(
    id: Double,
    machineCount: Double,
    machines: js.Array[DeploymentMachine],
    name: String,
    pool: TaskAgentPoolReference,
    project: ProjectReference
  ): DeploymentGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], machineCount = machineCount.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pool = pool.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroup]
  }
  
  extension [Self <: DeploymentGroup](x: Self) {
    
    inline def setMachineCount(value: Double): Self = StObject.set(x, "machineCount", value.asInstanceOf[js.Any])
    
    inline def setMachines(value: js.Array[DeploymentMachine]): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    inline def setMachinesVarargs(value: DeploymentMachine*): Self = StObject.set(x, "machines", js.Array(value*))
  }
}
