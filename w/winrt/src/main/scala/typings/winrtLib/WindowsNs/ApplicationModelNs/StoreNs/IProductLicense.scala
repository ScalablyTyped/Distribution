package typings
package winrtLib.WindowsNs.ApplicationModelNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductLicense extends js.Object {
  var expirationDate: stdLib.Date
  var isActive: scala.Boolean
  var productId: java.lang.String
}

object IProductLicense {
  @scala.inline
  def apply(expirationDate: stdLib.Date, isActive: scala.Boolean, productId: java.lang.String): IProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate, isActive = isActive, productId = productId)
  
    __obj.asInstanceOf[IProductLicense]
  }
}

