package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod
  /** The number of items retrieved. */ var returnValue: Double
}

object ItemsHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): ItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpMethod]
  }
}

