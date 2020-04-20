package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpExpectationHeaderValue extends js.Object {
  /** An array of HttpExpectationHeaderValue items that start at startIndex in the HttpExpectationHeaderValueCollection . */ var items: HttpExpectationHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsHttpExpectationHeaderValue {
  @scala.inline
  def apply(items: HttpExpectationHeaderValue, returnValue: Double): AnonItemsHttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpExpectationHeaderValue]
  }
}

