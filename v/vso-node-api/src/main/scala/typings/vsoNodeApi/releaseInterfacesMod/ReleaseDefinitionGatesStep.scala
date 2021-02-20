package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionGatesStep extends StObject {
  
  var gates: js.Array[ReleaseDefinitionGate] = js.native
  
  var gatesOptions: ReleaseDefinitionGatesOptions = js.native
  
  var id: Double = js.native
}
object ReleaseDefinitionGatesStep {
  
  @scala.inline
  def apply(gates: js.Array[ReleaseDefinitionGate], gatesOptions: ReleaseDefinitionGatesOptions, id: Double): ReleaseDefinitionGatesStep = {
    val __obj = js.Dynamic.literal(gates = gates.asInstanceOf[js.Any], gatesOptions = gatesOptions.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseDefinitionGatesStep]
  }
  
  @scala.inline
  implicit class ReleaseDefinitionGatesStepMutableBuilder[Self <: ReleaseDefinitionGatesStep] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGates(value: js.Array[ReleaseDefinitionGate]): Self = StObject.set(x, "gates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatesOptions(value: ReleaseDefinitionGatesOptions): Self = StObject.set(x, "gatesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatesVarargs(value: ReleaseDefinitionGate*): Self = StObject.set(x, "gates", js.Array(value :_*))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
