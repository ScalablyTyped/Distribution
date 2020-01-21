package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueHttpConnectionOptionHeaderValue extends js.Object {
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double
}

object AnonItemsReturnValueHttpConnectionOptionHeaderValue {
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): AnonItemsReturnValueHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueHttpConnectionOptionHeaderValue]
  }
}

