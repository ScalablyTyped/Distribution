package typings
package twitchDashExtLib

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
  var displayName: java.lang.String
  /**
  	 * This field is returned only for extension versions that are not in the Released state.
  	 */
  var inDevelopment: js.UndefOr[scala.Boolean] = js.undefined
  /**
  	 * Unique ID for the product.
  	 */
  var sku: java.lang.String
}

object TwitchExtBitsProduct {
  @scala.inline
  def apply(
    cost: TwitchExtBitsProductCost,
    displayName: java.lang.String,
    sku: java.lang.String,
    inDevelopment: js.UndefOr[scala.Boolean] = js.undefined
  ): TwitchExtBitsProduct = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cost")(cost)
    __obj.updateDynamic("displayName")(displayName)
    __obj.updateDynamic("sku")(sku)
    if (!js.isUndefined(inDevelopment)) __obj.updateDynamic("inDevelopment")(inDevelopment)
    __obj.asInstanceOf[TwitchExtBitsProduct]
  }
}

