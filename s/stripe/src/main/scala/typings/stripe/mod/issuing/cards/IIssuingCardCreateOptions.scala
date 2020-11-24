package typings.stripe.mod.issuing.cards

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Creates an Issuing Card object.
  */
@js.native
trait IIssuingCardCreateOptions extends IIssuingCardUpdateOptions {
  
  /**
    * The currency for the card. This currently must be usd.
    */
  var currency: String = js.native
  
  /**
    * The card this is meant to be a replacement for (if any).
    */
  var replacement_for: js.UndefOr[String] = js.native
  
  /**
    * If replacement_for is specified, this should indicate why that card is being replaced. One of damage, expiration, loss, or theft.
    */
  var replacement_reason: js.UndefOr[IssuingCardReplacementReason] = js.native
  
  /**
    * The address where the card will be shipped.
    */
  var shipping: js.UndefOr[IIssuingCardShippingAddress] = js.native
  
  /**
    * The type of card to issue. Possible values are physical or virtual.
    */
  var `type`: IssuingCardType = js.native
}
object IIssuingCardCreateOptions {
  
  @scala.inline
  def apply(currency: String, `type`: IssuingCardType): IIssuingCardCreateOptions = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIssuingCardCreateOptions]
  }
  
  @scala.inline
  implicit class IIssuingCardCreateOptionsOps[Self <: IIssuingCardCreateOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: IssuingCardType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacement_for(value: String): Self = this.set("replacement_for", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacement_for: Self = this.set("replacement_for", js.undefined)
    
    @scala.inline
    def setReplacement_reason(value: IssuingCardReplacementReason): Self = this.set("replacement_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacement_reason: Self = this.set("replacement_reason", js.undefined)
    
    @scala.inline
    def setShipping(value: IIssuingCardShippingAddress): Self = this.set("shipping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShipping: Self = this.set("shipping", js.undefined)
  }
}
