package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsReturnValueHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): AnonItemsReturnValueHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueHttpMethod]
  }
}

