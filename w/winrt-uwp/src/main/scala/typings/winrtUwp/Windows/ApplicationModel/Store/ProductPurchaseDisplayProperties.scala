package typings.winrtUwp.Windows.ApplicationModel.Store

import typings.winrtUwp.Windows.Foundation.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to provide the product name that is displayed to the user at time of purchase. */
trait ProductPurchaseDisplayProperties extends js.Object {
  /** Windows Phone only. This is an internal product description. */
  var description: String
  /** Windows Phone only. Gets or sets the location of an image used to represent the product at time of purchase. */
  var image: Uri
  /** Gets or sets the product name that is displayed to the user at time of purchase. */
  var name: String
}

object ProductPurchaseDisplayProperties {
  @scala.inline
  def apply(description: String, image: Uri, name: String): ProductPurchaseDisplayProperties = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductPurchaseDisplayProperties]
  }
}

