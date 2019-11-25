package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpTransferCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpTransferCodingHeaderValue extends js.Object {
  /** An array of HttpTransferCodingHeaderValue items that start at startIndex in the HttpTransferCodingHeaderValueCollection . */ var items: HttpTransferCodingHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpTransferCodingHeaderValue {
  @scala.inline
  def apply(items: HttpTransferCodingHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpTransferCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpTransferCodingHeaderValue]
  }
}

