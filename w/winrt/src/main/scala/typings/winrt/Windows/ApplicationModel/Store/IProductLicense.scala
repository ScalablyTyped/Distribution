package typings.winrt.Windows.ApplicationModel.Store

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProductLicense extends js.Object {
  var expirationDate: Date
  var isActive: Boolean
  var productId: String
}

object IProductLicense {
  @scala.inline
  def apply(expirationDate: Date, isActive: Boolean, productId: String): IProductLicense = {
    val __obj = js.Dynamic.literal(expirationDate = expirationDate, isActive = isActive, productId = productId)
  
    __obj.asInstanceOf[IProductLicense]
  }
}

