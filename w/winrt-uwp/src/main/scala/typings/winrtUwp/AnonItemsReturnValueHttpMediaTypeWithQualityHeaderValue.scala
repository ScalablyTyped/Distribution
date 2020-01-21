package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpMediaTypeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsReturnValueHttpMediaTypeWithQualityHeaderValue extends js.Object {
  /** An array of HttpMediaTypeWithQualityHeaderValue items that start at startIndex in the HttpMediaTypeWithQualityHeaderValueCollection . */ var items: HttpMediaTypeWithQualityHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsReturnValueHttpMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(items: HttpMediaTypeWithQualityHeaderValue, returnValue: Double): AnonItemsReturnValueHttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsReturnValueHttpMediaTypeWithQualityHeaderValue]
  }
}

