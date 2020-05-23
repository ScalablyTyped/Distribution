package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductInfoHeaderValue extends js.Object {
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: HttpProductInfoHeaderValue
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object ProductInfoHeaderValue {
  @scala.inline
  def apply(productInfoHeaderValue: HttpProductInfoHeaderValue, returnValue: Boolean): ProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductInfoHeaderValue]
  }
}

