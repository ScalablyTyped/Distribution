package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue extends js.Object {
  /** An array of HttpMediaTypeWithQualityHeaderValue items that start at startIndex in the HttpMediaTypeWithQualityHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeWithQualityHeaderValue
  /** The number of items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpMediaTypeWithQualityHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpMediaTypeWithQualityHeaderValue]
  }
}

