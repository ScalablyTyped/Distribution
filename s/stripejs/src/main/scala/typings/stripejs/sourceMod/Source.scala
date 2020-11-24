package typings.stripejs.sourceMod

import org.scalablytyped.runtime.StringDictionary
import typings.stripejs.customerMod.Customer
import typings.stripejs.stripejsStrings.canceled
import typings.stripejs.stripejsStrings.chargeable
import typings.stripejs.stripejsStrings.code_verification
import typings.stripejs.stripejsStrings.consumed
import typings.stripejs.stripejsStrings.failed
import typings.stripejs.stripejsStrings.none
import typings.stripejs.stripejsStrings.pending
import typings.stripejs.stripejsStrings.receiver
import typings.stripejs.stripejsStrings.redirect
import typings.stripejs.stripejsStrings.reusable
import typings.stripejs.stripejsStrings.source
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source
  extends /**
  * A matching name to the type with extra information about the payment method
  * @see type
  */
/* key */ StringDictionary[js.Any] {
  
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00,
    * or 1 for ¥1, Japanese Yen being a zero-decimal currency) representing the total
    * amount associated with the source
    */
  var amount: Double = js.native
  
  /**
    * The client secret of the source.
    * Used for client-side retrieval using a publishable key.
    */
  var client_secret: String = js.native
  
  /**
    * Information related to the code verification flow
    * Present if the source is authenticated by a verification code
    */
  var code_verification: js.UndefOr[CodeVerification] = js.native
  
  /**
    * Time at which the object was created.
    * Measured in seconds since the Unix epoch.
    * (Timestamp)
    */
  var created: Double = js.native
  
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String = js.native
  
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none = js.native
  
  /**
    * Unique identifier for the object
    */
  var id: String = js.native
  
  /**
    * LIVE MODE = true
    * TEST MODE = false
    */
  var livemode: Boolean = js.native
  
  /**
    * Your own saved information with this bank account
    */
  var metadata: StringDictionary[String] = js.native
  
  var `object`: source = js.native
  
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: Customer = js.native
  
  /**
    * Information related to the receiver flow.
    * Present if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.native
  
  /**
    * Information related to the redirect flow.
    * Present if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.native
  
  /**
    * Extra information about a source
    * NOTE: This will appear on your customer’s statement every time you charge the source
    */
  var statement_descriptor: String = js.native
  
  /**
    * The status of the source
    * NOTE: Only `chargeable` sources can be used to create a charge
    */
  var status: pending | canceled | failed | consumed | chargeable = js.native
  
  /**
    * The type of the source.
    * NOTE: The type is a payment method
    */
  var `type`: paymentOptions = js.native
  
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable = js.native
}
object Source {
  
  @scala.inline
  def apply(
    amount: Double,
    client_secret: String,
    created: Double,
    currency: String,
    flow: redirect | receiver | code_verification | none,
    id: String,
    livemode: Boolean,
    metadata: StringDictionary[String],
    `object`: source,
    owner: Customer,
    statement_descriptor: String,
    status: pending | canceled | failed | consumed | chargeable,
    `type`: paymentOptions,
    usage: reusable
  ): Source = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceOps[Self <: Source] (val x: Self) extends AnyVal {
    
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
    def setClient_secret(value: String): Self = this.set("client_secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated(value: Double): Self = this.set("created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlow(value: redirect | receiver | code_verification | none): Self = this.set("flow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLivemode(value: Boolean): Self = this.set("livemode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadata(value: StringDictionary[String]): Self = this.set("metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObject(value: source): Self = this.set("object", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: Customer): Self = this.set("owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor(value: String): Self = this.set("statement_descriptor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: pending | canceled | failed | consumed | chargeable): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: paymentOptions): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: reusable): Self = this.set("usage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode_verification(value: CodeVerification): Self = this.set("code_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCode_verification: Self = this.set("code_verification", js.undefined)
    
    @scala.inline
    def setReceiver(value: Receiver): Self = this.set("receiver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiver: Self = this.set("receiver", js.undefined)
    
    @scala.inline
    def setRedirect(value: Redirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
  }
}
