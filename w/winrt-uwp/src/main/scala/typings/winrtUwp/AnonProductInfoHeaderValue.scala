package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProductInfoHeaderValue extends js.Object {
  /** The HttpProductInfoHeaderValue version of the string. */ var productInfoHeaderValue: HttpProductInfoHeaderValue
  /** true if input is valid HttpProductInfoHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object AnonProductInfoHeaderValue {
  @scala.inline
  def apply(productInfoHeaderValue: HttpProductInfoHeaderValue, returnValue: Boolean): AnonProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(productInfoHeaderValue = productInfoHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonProductInfoHeaderValue]
  }
}

