package typings.stripe.anon

import typings.stripe.stripeStrings.fraudulent
import typings.stripe.stripeStrings.safe
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Userreport extends js.Object {
  
  /**
    * If you believe a charge is fraudulent, include a user_report key with a value of fraudulent. If you believe a
    * charge is safe, include a user_report key with a value of safe. Note that you must refund a charge before setting
    * the user_report to fraudulent. Stripe will use the information you send to improve our fraud detection algorithm
    */
  var user_report: js.UndefOr[fraudulent | safe] = js.native
}
object Userreport {
  
  @scala.inline
  def apply(): Userreport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Userreport]
  }
  
  @scala.inline
  implicit class UserreportOps[Self <: Userreport] (val x: Self) extends AnyVal {
    
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
    def setUser_report(value: fraudulent | safe): Self = this.set("user_report", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser_report: Self = this.set("user_report", js.undefined)
  }
}
