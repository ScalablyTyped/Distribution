package typings.stripe.mod.plans

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlanUpdateOptions extends IDataOptionsWithMetadata {
  
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: js.UndefOr[Boolean] = js.native
  
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[String] = js.native
  
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[String] = js.native
  
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: js.UndefOr[Double] = js.native
}
object IPlanUpdateOptions {
  
  @scala.inline
  def apply(): IPlanUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlanUpdateOptions]
  }
  
  @scala.inline
  implicit class IPlanUpdateOptionsOps[Self <: IPlanUpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setNickname(value: String): Self = this.set("nickname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNickname: Self = this.set("nickname", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setTrial_period_days(value: Double): Self = this.set("trial_period_days", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrial_period_days: Self = this.set("trial_period_days", js.undefined)
  }
}
