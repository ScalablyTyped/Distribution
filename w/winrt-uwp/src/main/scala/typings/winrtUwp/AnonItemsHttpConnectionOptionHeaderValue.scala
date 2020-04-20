package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpConnectionOptionHeaderValue extends js.Object {
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double
}

object AnonItemsHttpConnectionOptionHeaderValue {
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): AnonItemsHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpConnectionOptionHeaderValue]
  }
}

