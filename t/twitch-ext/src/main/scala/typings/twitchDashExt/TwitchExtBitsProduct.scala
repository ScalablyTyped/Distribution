package typings.twitchDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtBitsProduct extends js.Object {
  /**
  	 * Cost object.
  	 */
  var cost: TwitchExtBitsProductCost
  /**
  	 * Registered display name for the SKU.
  	 */
  var displayName: String
  /**
  	 * This field is returned only for extension versions that are not in the Released state.
  	 */
  var inDevelopment: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Unique ID for the product.
  	 */
  var sku: String
}

object TwitchExtBitsProduct {
  @scala.inline
  def apply(
    cost: TwitchExtBitsProductCost,
    displayName: String,
    sku: String,
    inDevelopment: js.UndefOr[Boolean] = js.undefined
  ): TwitchExtBitsProduct = {
    val __obj = js.Dynamic.literal(cost = cost, displayName = displayName, sku = sku)
    if (!js.isUndefined(inDevelopment)) __obj.updateDynamic("inDevelopment")(inDevelopment)
    __obj.asInstanceOf[TwitchExtBitsProduct]
  }
}

