package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentMachinesChangeEvent extends StObject {
  
  var machineGroupReference: DeploymentGroupReference
  
  var machines: js.Array[DeploymentMachine]
}
object DeploymentMachinesChangeEvent {
  
  inline def apply(machineGroupReference: DeploymentGroupReference, machines: js.Array[DeploymentMachine]): DeploymentMachinesChangeEvent = {
    val __obj = js.Dynamic.literal(machineGroupReference = machineGroupReference.asInstanceOf[js.Any], machines = machines.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentMachinesChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeploymentMachinesChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setMachineGroupReference(value: DeploymentGroupReference): Self = StObject.set(x, "machineGroupReference", value.asInstanceOf[js.Any])
    
    inline def setMachines(value: js.Array[DeploymentMachine]): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    inline def setMachinesVarargs(value: DeploymentMachine*): Self = StObject.set(x, "machines", js.Array(value*))
  }
}
