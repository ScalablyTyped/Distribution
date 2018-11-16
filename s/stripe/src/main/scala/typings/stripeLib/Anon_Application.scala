package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Application extends js.Object {
  var amount: scala.Double
  var application: java.lang.String
  /**
                   * Three-letter ISO currency code representing the currency of the amount that was disputed.
                   */
  var currency: java.lang.String
  var description: java.lang.String
  /**
                   * Type of the fee, one of: "application_fee", "stripe_fee"" or "tax".
                   */
  var `type`: java.lang.String
}

