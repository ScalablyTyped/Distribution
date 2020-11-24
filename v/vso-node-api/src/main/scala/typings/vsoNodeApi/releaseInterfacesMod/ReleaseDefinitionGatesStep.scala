package typings.vsoNodeApi.releaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseDefinitionGatesStep extends js.Object {
  
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
  implicit class ReleaseDefinitionGatesStepOps[Self <: ReleaseDefinitionGatesStep] (val x: Self) extends AnyVal {
    
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
    def setGatesVarargs(value: ReleaseDefinitionGate*): Self = this.set("gates", js.Array(value :_*))
    
    @scala.inline
    def setGates(value: js.Array[ReleaseDefinitionGate]): Self = this.set("gates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatesOptions(value: ReleaseDefinitionGatesOptions): Self = this.set("gatesOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
