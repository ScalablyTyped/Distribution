package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the product name that is displayed to the user at time of purchase. */
@JSGlobal("Windows.ApplicationModel.Store.ProductPurchaseDisplayProperties")
@js.native
/** Creates an instance of ProductPurchaseDisplayProperties . */
class ProductPurchaseDisplayProperties () extends js.Object {
  /**
    * Creates an instance of ProductPurchaseDisplayProperties that includes the specified product name to display to the user.
    * @param name The product name displayed to the user.
    */
  def this(name: String) = this()
  /** Windows Phone only. This is an internal product description. */
  var description: String = js.native
  /** Windows Phone only. Gets or sets the location of an image used to represent the product at time of purchase. */
  var image: Uri = js.native
  /** Gets or sets the product name that is displayed to the user at time of purchase. */
  var name: String = js.native
}

