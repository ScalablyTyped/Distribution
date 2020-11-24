package typings.synaptic.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofTrainer extends js.Object {
  
  val cost: Typeofcost = js.native
}
object TypeofTrainer {
  
  @scala.inline
  def apply(cost: Typeofcost): TypeofTrainer = {
    val __obj = js.Dynamic.literal(cost = cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofTrainer]
  }
  
  @scala.inline
  implicit class TypeofTrainerOps[Self <: TypeofTrainer] (val x: Self) extends AnyVal {
    
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
    def setCost(value: Typeofcost): Self = this.set("cost", value.asInstanceOf[js.Any])
  }
}
