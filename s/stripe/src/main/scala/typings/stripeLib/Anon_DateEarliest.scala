package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DateEarliest extends js.Object {
  /**
    * If type is "exact", date will be the expected delivery date in the format YYYY-MM-DD
    */
  var date: java.lang.String
  /**
    * If type is "range", earliest will be be the earliest delivery date in the format YYYY-MM-DD
    */
  var earliest: java.lang.String
  /**
    * If type is "range", latest will be the latest delivery date in the format YYYY-MM-DD
    */
  var latest: java.lang.String
  /**
    * The type of estimate. Must be either "range" or "exact"
    */
  var `type`: stripeLib.stripeLibStrings.range | stripeLib.stripeLibStrings.exact
}

object Anon_DateEarliest {
  @scala.inline
  def apply(
    date: java.lang.String,
    earliest: java.lang.String,
    latest: java.lang.String,
    `type`: stripeLib.stripeLibStrings.range | stripeLib.stripeLibStrings.exact
  ): Anon_DateEarliest = {
    val __obj = js.Dynamic.literal(date = date, earliest = earliest, latest = latest)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DateEarliest]
  }
}

