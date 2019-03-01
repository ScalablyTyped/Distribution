package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductListing extends js.Object {
  var formattedPrice: java.lang.String
  var name: java.lang.String
  var productId: java.lang.String
}

object IProductListing {
  @scala.inline
  def apply(formattedPrice: java.lang.String, name: java.lang.String, productId: java.lang.String): IProductListing = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formattedPrice")(formattedPrice)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("productId")(productId)
    __obj.asInstanceOf[IProductListing]
  }
}

