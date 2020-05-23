package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpTransferCodingHeaderValue extends js.Object {
  /** An array of HttpTransferCodingHeaderValue items that start at startIndex in the HttpTransferCodingHeaderValueCollection . */ var items: HttpTransferCodingHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object ItemsHttpTransferCodingHeaderValue {
  @scala.inline
  def apply(items: HttpTransferCodingHeaderValue, returnValue: Double): ItemsHttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpTransferCodingHeaderValue]
  }
}

