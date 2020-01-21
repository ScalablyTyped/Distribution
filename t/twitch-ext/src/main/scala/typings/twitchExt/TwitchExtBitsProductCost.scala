package typings.twitchExt

import typings.twitchExt.twitchExtStrings.bits
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtBitsProductCost extends js.Object {
  /**
  	 * Number of Bits required for the product.
  	 */
  var amount: String
  /**
  	 * Always the string "bits". Reserved for future use.
  	 */
  var `type`: bits
}

object TwitchExtBitsProductCost {
  @scala.inline
  def apply(amount: String, `type`: bits): TwitchExtBitsProductCost = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtBitsProductCost]
  }
}

