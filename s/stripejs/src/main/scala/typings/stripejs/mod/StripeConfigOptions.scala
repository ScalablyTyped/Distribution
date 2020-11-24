package typings.stripejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeConfigOptions extends js.Object {
  
  var stripeAccount: String = js.native
}
object StripeConfigOptions {
  
  @scala.inline
  def apply(stripeAccount: String): StripeConfigOptions = {
    val __obj = js.Dynamic.literal(stripeAccount = stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeConfigOptions]
  }
  
  @scala.inline
  implicit class StripeConfigOptionsOps[Self <: StripeConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setStripeAccount(value: String): Self = this.set("stripeAccount", value.asInstanceOf[js.Any])
  }
}
