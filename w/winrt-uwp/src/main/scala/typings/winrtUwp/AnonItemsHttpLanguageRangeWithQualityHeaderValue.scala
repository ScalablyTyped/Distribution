package typings.winrtUwp

import typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItemsHttpLanguageRangeWithQualityHeaderValue extends js.Object {
  /** An array of HttpLanguageRangeWithQualityHeaderValue items that start at startIndex in the HttpLanguageRangeWithQualityHeaderValueCollection . */ var items: HttpLanguageRangeWithQualityHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object AnonItemsHttpLanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(items: HttpLanguageRangeWithQualityHeaderValue, returnValue: Double): AnonItemsHttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItemsHttpLanguageRangeWithQualityHeaderValue]
  }
}

