package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentMachineGroup
  extends StObject
     with DeploymentMachineGroupReference {
  
  var machines: js.Array[DeploymentMachine]
  
  var size: Double
}
object DeploymentMachineGroup {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: DeploymentMachineGroup] (val x: Self) extends AnyVal {
    
    inline def setMachines(value: js.Array[DeploymentMachine]): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    inline def setMachinesVarargs(value: DeploymentMachine*): Self = StObject.set(x, "machines", js.Array(value*))
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
