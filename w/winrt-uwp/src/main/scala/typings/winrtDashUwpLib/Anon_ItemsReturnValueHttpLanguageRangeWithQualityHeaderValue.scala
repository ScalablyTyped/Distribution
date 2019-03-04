package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpLanguageRangeWithQualityHeaderValue extends js.Object {
  /** An array of HttpLanguageRangeWithQualityHeaderValue items that start at startIndex in the HttpLanguageRangeWithQualityHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpLanguageRangeWithQualityHeaderValue
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpLanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpLanguageRangeWithQualityHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpLanguageRangeWithQualityHeaderValue]
  }
}

