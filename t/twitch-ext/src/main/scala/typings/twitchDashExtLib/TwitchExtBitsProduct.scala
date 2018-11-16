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

