package typings.winrtUwp.Windows.Services.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
trait StorePurchaseProperties extends js.Object {
  /** Gets or sets a JSON-formatted string that contains extended data to pass with the purchase request to the Windows Store. */
  var extendedJsonData: String
  /** Gets or sets the product name that is displayed to the user during the purchase. The specified name appears in the title bar of the purchase UI. */
  var name: String
}

object StorePurchaseProperties {
  @scala.inline
  def apply(extendedJsonData: String, name: String): StorePurchaseProperties = {
    val __obj = js.Dynamic.literal(extendedJsonData = extendedJsonData.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePurchaseProperties]
  }
}

