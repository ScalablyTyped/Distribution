package typings
package stripejsLib.sourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SourceData extends js.Object {
  /**
       * This is the amount for which the source will be chargeable once ready
       */
  var amount: scala.Double
  /**
       * Three-letter ISO code for the currency associated with the source
       */
  var currency: java.lang.String
  /**
       * The authentication flow of the source
       */
  var flow: stripejsLib.stripejsLibStrings.redirect | stripejsLib.stripejsLibStrings.receiver | stripejsLib.stripejsLibStrings.code_verification | stripejsLib.stripejsLibStrings.none
  /**
       * Information about a mandate possiblity attached to a source object
       * (generally for bank debits) as well as its acceptance status
       */
  var mandate: js.UndefOr[Mandate] = js.undefined
  /**
       * Extra data you want to add to the source object
       */
  var metadata: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * Information about the owner of the payment instrument that may be used or
       * required by particular source types.
       */
  var owner: js.UndefOr[stripejsLib.customerMod.Customer] = js.undefined
  /**
       * Can be set only if the source is a receiver
       */
  var receiver: js.UndefOr[Receiver] = js.undefined
  /**
       * Required if the source is authenticated by a redirect
       */
  var redirect: js.UndefOr[Redirect] = js.undefined
  /**
       * An arbitrary string to be displayed on your customer’s statement
       * @example if your website is RunClub and the item you’re charging for is a race ticket,
       * you may want to specify a statement_descriptor of RunClub 5K race ticket.
       */
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  var three_d_secure_2_eap: js.UndefOr[js.Any] = js.undefined
  /**
       * When passed, token properties will override source parameters
       */
  var token: js.UndefOr[stripejsLib.tokenMod.Token] = js.undefined
  /**
       * The type of the source to create
       */
  var `type`: paymentOptions
  /**
       * Whether this source should be reusable or not
       */
  var usage: stripejsLib.stripejsLibStrings.reusable | stripejsLib.stripejsLibStrings.single_use
}

