package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpConnectionOptionHeaderValue extends js.Object {
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double
}

object ItemsHttpConnectionOptionHeaderValue {
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): ItemsHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpConnectionOptionHeaderValue]
  }
}

