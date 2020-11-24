package typings.stripe.mod.plans

import typings.stripe.stripeStrings.down
import typings.stripe.stripeStrings.up
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITransformUsage extends js.Object {
  
  /**
    * Divide usage by this number.
    */
  var divide_by: Double = js.native
  
  /**
    * After division, either round the result `up` or `down`.
    */
  var round: up | down = js.native
}
object ITransformUsage {
  
  @scala.inline
  def apply(divide_by: Double, round: up | down): ITransformUsage = {
    val __obj = js.Dynamic.literal(divide_by = divide_by.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITransformUsage]
  }
  
  @scala.inline
  implicit class ITransformUsageOps[Self <: ITransformUsage] (val x: Self) extends AnyVal {
    
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
    def setDivide_by(value: Double): Self = this.set("divide_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRound(value: up | down): Self = this.set("round", value.asInstanceOf[js.Any])
  }
}
