package typings.stripe.mod.setupIntents

import typings.stripe.anon.Requestthreedsecure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISetupIntentPaymentMethodOptions extends js.Object {
  
  /**
    * Configuration for any card payments attempted on this SetupIntent.
    */
  var card: js.UndefOr[Requestthreedsecure] = js.native
}
object ISetupIntentPaymentMethodOptions {
  
  @scala.inline
  def apply(): ISetupIntentPaymentMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISetupIntentPaymentMethodOptions]
  }
  
  @scala.inline
  implicit class ISetupIntentPaymentMethodOptionsOps[Self <: ISetupIntentPaymentMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setCard(value: Requestthreedsecure): Self = this.set("card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCard: Self = this.set("card", js.undefined)
  }
}
