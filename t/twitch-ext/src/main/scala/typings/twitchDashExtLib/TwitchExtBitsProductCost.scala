package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtBitsProductCost extends js.Object {
  /**
  	 * Number of Bits required for the product.
  	 */
  var amount: java.lang.String
  /**
  	 * Always the string "bits". Reserved for future use.
  	 */
  var `type`: twitchDashExtLib.twitchDashExtLibStrings.bits
}

object TwitchExtBitsProductCost {
  @scala.inline
  def apply(amount: java.lang.String, `type`: twitchDashExtLib.twitchDashExtLibStrings.bits): TwitchExtBitsProductCost = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.asInstanceOf[TwitchExtBitsProductCost]
  }
}

