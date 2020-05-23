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
import scala.scalajs.js.annotation._

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
  var amount: Double
  /**
    * The client secret of the source.
    * Used for client-side retrieval using a publishable key.
    */
  var client_secret: String
  /**
    * Information related to the code verification flow
    * Present if the source is authenticated by a verification code
    */
  var code_verification: js.UndefOr[CodeVerification] = js.undefined
  /**
    * Time at which the object was created.
    * Measured in seconds since the Unix epoch.
    * (Timestamp)
    */
  var created: Double
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: String
  /**
    * The authentication flow of the source
    */
  var flow: redirect | receiver | code_verification | none
  /**
    * Unique identifier for the object
    */
  var id: String
  /**
    * LIVE MODE = true
    * TEST MODE = false
    */
  var livemode: Boolean
  /**
    * Your own saved information with this bank account
    */
  var metadata: StringDictionary[String]
  var `object`: source
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: Customer
  /**
    * Information related to the receiver flow.
    * Present if the source is a receiver
    */
  var receiver: js.UndefOr[Receiver] = js.undefined
  /**
    * Information related to the redirect flow.
    * Present if the source is authenticated by a redirect
    */
  var redirect: js.UndefOr[Redirect] = js.undefined
  /**
    * Extra information about a source
    * NOTE: This will appear on your customer’s statement every time you charge the source
    */
  var statement_descriptor: String
  /**
    * The status of the source
    * NOTE: Only `chargeable` sources can be used to create a charge
    */
  var status: pending | canceled | failed | consumed | chargeable
  /**
    * The type of the source.
    * NOTE: The type is a payment method
    */
  var `type`: paymentOptions
  /**
    * Whether this source should be reusable or not
    */
  var usage: reusable
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
    usage: reusable,
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    code_verification: CodeVerification = null,
    receiver: Receiver = null,
    redirect: Redirect = null
  ): Source = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], flow = flow.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], livemode = livemode.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], statement_descriptor = statement_descriptor.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (code_verification != null) __obj.updateDynamic("code_verification")(code_verification.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(receiver.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

