package typings.winrt.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductListing extends js.Object {
  var formattedPrice: String
  var name: String
  var productId: String
}

object IProductListing {
  @scala.inline
  def apply(formattedPrice: String, name: String, productId: String): IProductListing = {
    val __obj = js.Dynamic.literal(formattedPrice = formattedPrice, name = name, productId = productId)
  
    __obj.asInstanceOf[IProductListing]
  }
}

