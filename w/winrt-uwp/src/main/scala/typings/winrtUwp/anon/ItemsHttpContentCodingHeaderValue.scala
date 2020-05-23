package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpContentCodingHeaderValue extends js.Object {
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: HttpContentCodingHeaderValue
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: Double
}

object ItemsHttpContentCodingHeaderValue {
  @scala.inline
  def apply(items: HttpContentCodingHeaderValue, returnValue: Double): ItemsHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpContentCodingHeaderValue]
  }
}

