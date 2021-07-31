package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Machines extends StObject {
  
  var machines: scala.Double
  
  var none: scala.Double
}
object Machines {
  
  @scala.inline
  def apply(machines: scala.Double, none: scala.Double): Machines = {
    val __obj = js.Dynamic.literal(machines = machines.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[Machines]
  }
  
  @scala.inline
  implicit class MachinesMutableBuilder[Self <: Machines] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMachines(value: scala.Double): Self = StObject.set(x, "machines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
