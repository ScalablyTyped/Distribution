package typings.winrt.Windows.ApplicationModel.Store

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductListing extends IProductListing

object ProductListing {
  @scala.inline
  def apply(formattedPrice: String, name: String, productId: String): ProductListing = {
    val __obj = js.Dynamic.literal(formattedPrice = formattedPrice.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductListing]
  }
}

