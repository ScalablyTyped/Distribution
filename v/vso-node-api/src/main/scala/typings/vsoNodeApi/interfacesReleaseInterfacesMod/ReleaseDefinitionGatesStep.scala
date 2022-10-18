package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseDefinitionGatesStep extends StObject {
  
  var gates: js.Array[ReleaseDefinitionGate]
  
  var gatesOptions: ReleaseDefinitionGatesOptions
  
  var id: Double
}
object ReleaseDefinitionGatesStep {
  
  inline def apply(gates: js.Array[ReleaseDefinitionGate], gatesOptions: ReleaseDefinitionGatesOptions, id: Double): ReleaseDefinitionGatesStep = {
    val __obj = js.Dynamic.literal(gates = gates.asInstanceOf[js.Any], gatesOptions = gatesOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGatesStep]
  }
  
  extension [Self <: ReleaseDefinitionGatesStep](x: Self) {
    
    inline def setGates(value: js.Array[ReleaseDefinitionGate]): Self = StObject.set(x, "gates", value.asInstanceOf[js.Any])
    
    inline def setGatesOptions(value: ReleaseDefinitionGatesOptions): Self = StObject.set(x, "gatesOptions", value.asInstanceOf[js.Any])
    
    inline def setGatesVarargs(value: ReleaseDefinitionGate*): Self = StObject.set(x, "gates", js.Array(value*))
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
