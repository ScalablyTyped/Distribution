package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object ProductHeaderValue {
  @scala.inline
  def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): ProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductHeaderValue]
  }
}

