package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object stripeMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.stripe.Anon_Gt

  /**
    * Header options can either be a Connect Account Secret Key,
    * or a hash with one or more of these keys: idempotency_key, stripe_account, api_key
    */
  type HeaderOptions = IHeaderOptions | String
  // Helper
  type IBankAccount = typings.stripe.stripeMod.bankAccounts.IBankAccount
  type ICard = typings.stripe.stripeMod.cards.ICard
  /**
    * A filter on the list based on this object field. The value can
    * be a string with an integer Unix timestamp, or it can be a
    * dictionary with the following options:
    */
  type IDateFilter = String | Anon_Gt
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  type IMetadata = StringDictionary[String]
  /**
    * A set of key/value pairs that you can attach to an object. It can be useful for storing
    * additional information about the object in a structured format.
    */
  type IOptionsMetadata = StringDictionary[String | Double]
  type IResponseFn[R] = js.Function2[/* err */ IStripeError, /* value */ R, Unit]
  type ISource = typings.stripe.stripeMod.sources.ISource
}
