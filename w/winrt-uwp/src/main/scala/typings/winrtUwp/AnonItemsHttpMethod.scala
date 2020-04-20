package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): AnonItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonItemsHttpMethod]
  }
}

