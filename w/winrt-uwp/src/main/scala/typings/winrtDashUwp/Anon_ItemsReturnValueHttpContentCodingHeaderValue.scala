package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpContentCodingHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpContentCodingHeaderValue extends js.Object {
  /** An array of HttpContentCodingHeaderValue items that start at startIndex in the HttpContentCodingHeaderValueCollection . */ var items: HttpContentCodingHeaderValue
  /** The number of HttpContentCodingHeaderValue items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpContentCodingHeaderValue {
  @scala.inline
  def apply(items: HttpContentCodingHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpContentCodingHeaderValue]
  }
}

