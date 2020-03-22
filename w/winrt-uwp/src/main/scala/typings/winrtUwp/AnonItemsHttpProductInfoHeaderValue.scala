package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpProductInfoHeaderValue extends js.Object {
  /** An array of HttpProductInfoHeaderValue items that start at startIndex in the HttpProductInfoHeaderValueCollection . */ var items: HttpProductInfoHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsHttpProductInfoHeaderValue {
  @scala.inline
  def apply(items: HttpProductInfoHeaderValue, returnValue: Double): AnonItemsHttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsHttpProductInfoHeaderValue]
  }
}

