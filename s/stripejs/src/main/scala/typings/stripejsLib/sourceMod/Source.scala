package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source
  extends /**
  * A matching name to the type with extra information about the payment method
  * @see type
  */
/* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00,
    * or 1 for ¥1, Japanese Yen being a zero-decimal currency) representing the total
    * amount associated with the source
    */
  var amount: scala.Double
  /**
    * The client secret of the source.
    * Used for client-side retrieval using a publishable key.
    */
  var client_secret: java.lang.String
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
  var created: scala.Double
  /**
    * Three-letter ISO code for the currency associated with the source
    */
  var currency: java.lang.String
  /**
    * The authentication flow of the source
    */
  var flow: stripejsLib.stripejsLibStrings.redirect | stripejsLib.stripejsLibStrings.receiver | stripejsLib.stripejsLibStrings.code_verification | stripejsLib.stripejsLibStrings.none
  /**
    * Unique identifier for the object
    */
  var id: java.lang.String
  /**
    * LIVE MODE = true
    * TEST MODE = false
    */
  var livemode: scala.Boolean
  /**
    * Your own saved information with this bank account
    */
  var metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var `object`: stripejsLib.stripejsLibStrings.source
  /**
    * Information about the owner of the payment instrument that may be used or
    * required by particular source types.
    */
  var owner: stripejsLib.customerMod.Customer
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
  var statement_descriptor: java.lang.String
  /**
    * The status of the source
    * NOTE: Only `chargeable` sources can be used to create a charge
    */
  var status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.canceled | stripejsLib.stripejsLibStrings.failed | stripejsLib.stripejsLibStrings.consumed | stripejsLib.stripejsLibStrings.chargeable
  /**
    * The type of the source.
    * NOTE: The type is a payment method
    */
  var `type`: paymentOptions
  /**
    * Whether this source should be reusable or not
    */
  var usage: stripejsLib.stripejsLibStrings.reusable
}

object Source {
  @scala.inline
  def apply(
    amount: scala.Double,
    client_secret: java.lang.String,
    created: scala.Double,
    currency: java.lang.String,
    flow: stripejsLib.stripejsLibStrings.redirect | stripejsLib.stripejsLibStrings.receiver | stripejsLib.stripejsLibStrings.code_verification | stripejsLib.stripejsLibStrings.none,
    id: java.lang.String,
    livemode: scala.Boolean,
    metadata: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    `object`: stripejsLib.stripejsLibStrings.source,
    owner: stripejsLib.customerMod.Customer,
    statement_descriptor: java.lang.String,
    status: stripejsLib.stripejsLibStrings.pending | stripejsLib.stripejsLibStrings.canceled | stripejsLib.stripejsLibStrings.failed | stripejsLib.stripejsLibStrings.consumed | stripejsLib.stripejsLibStrings.chargeable,
    `type`: paymentOptions,
    usage: stripejsLib.stripejsLibStrings.reusable,
    StringDictionary: /**
    * A matching name to the type with extra information about the payment method
    * @see type
    */
  /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    code_verification: CodeVerification = null,
    receiver: Receiver = null,
    redirect: Redirect = null
  ): Source = {
    val __obj = js.Dynamic.literal(`object` = `object`, `type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("client_secret")(client_secret)
    __obj.updateDynamic("created")(created)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("flow")(flow.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("livemode")(livemode)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("owner")(owner)
    __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.updateDynamic("usage")(usage)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (code_verification != null) __obj.updateDynamic("code_verification")(code_verification)
    if (receiver != null) __obj.updateDynamic("receiver")(receiver)
    if (redirect != null) __obj.updateDynamic("redirect")(redirect)
    __obj.asInstanceOf[Source]
  }
}

