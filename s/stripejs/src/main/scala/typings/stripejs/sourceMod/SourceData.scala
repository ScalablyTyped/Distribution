package typings.stripejs.sourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.stripejs.customerMod.Customer
import typings.stripejs.stripejsStrings.code_verification
import typings.stripejs.stripejsStrings.none
import typings.stripejs.stripejsStrings.receiver
import typings.stripejs.stripejsStrings.redirect
import typings.stripejs.stripejsStrings.reusable
import typings.stripejs.stripejsStrings.single_use
import typings.stripejs.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceData extends js.Object {
  
  /**
    * This is the amount for which the source will be chargeable once ready
    */
  var amount: Double = js.native
  
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String = js.native
  
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none = js.native
  
  /**
    * Information about a mandate possiblity attached to a source object
    * (generally for bank debits) as well as its acceptance status
    */
  var mandate: js.UndefOr[Mandate] = js.native
  
  /**
    * Extra data you want to add to the source object
    */
  var metadata: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: js.UndefOr[Customer] = js.native
  
  /**
    * Can be set only if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.native
  
  /**
    * Required if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.native
  
  /**
    * An arbitrary string to be displayed on your customer’s statement
    * @example if your website is RunClub and the item you’re charging for is a race ticket,
    * you may want to specify a statement_descriptor of RunClub 5K race ticket.
    */
  var statement_descriptor: js.UndefOr[String] = js.native
  
  var three_d_secure_2_eap: js.UndefOr[js.Any] = js.native
  
  /**
    * When passed, token properties will override source parameters
    */
  var token: js.UndefOr[Token] = js.native
  
  /**
    * The type of the source to create
    */
  var `type`: paymentOptions = js.native
  
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable | single_use = js.native
}
object SourceData {
  
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    flow: redirect | receiver | code_verification | none,
    `type`: paymentOptions,
    usage: reusable | single_use
  ): SourceData = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceData]
  }
  
  @scala.inline
  implicit class SourceDataOps[Self <: SourceData] (val x: Self) extends AnyVal {
    
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
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: paymentOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: reusable | single_use): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMandate(value: Mandate): Self = this.set("mandate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMandate: Self = this.set("mandate", js.undefined)
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetadata: Self = this.set("metadata", js.undefined)
    
    @scala.inline
    def setOwner(value: Customer): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    
    @scala.inline
    def setReceiver(value: Receiver): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setRedirect(value: Redirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatement_descriptor: Self = this.set("statement_descriptor", js.undefined)
    
    @scala.inline
    def setThree_d_secure_2_eap(value: js.Any): Self = this.set("three_d_secure_2_eap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThree_d_secure_2_eap: Self = this.set("three_d_secure_2_eap", js.undefined)
    
    @scala.inline
    def setToken(value: Token): Self = this.set("token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToken: Self = this.set("token", js.undefined)
  }
}
