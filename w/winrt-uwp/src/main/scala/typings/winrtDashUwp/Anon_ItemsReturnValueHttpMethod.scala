package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): Anon_ItemsReturnValueHttpMethod = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpMethod]
  }
}

