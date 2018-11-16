package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains additional details that you can pass to a purchase request for a product, including the product name to display to the user during the purchase. */
@JSGlobal("Windows.Services.Store.StorePurchaseProperties")
@js.native
class StorePurchaseProperties () extends js.Object {
  /** Initializes a new instance of the StorePurchaseProperties class. This overload provides the option to specify the product name that is displayed to the user during the purchase.
                   * @param name The product name that is displayed to the user during the purchase.
                   */
  def this(name: java.lang.String) = this()
  /** Gets or sets a JSON-formatted string that contains extended data to pass with the purchase request to the Windows Store. */
  var extendedJsonData: java.lang.String = js.native
  /** Gets or sets the product name that is displayed to the user during the purchase. The specified name appears in the title bar of the purchase UI. */
  var name: java.lang.String = js.native
}

