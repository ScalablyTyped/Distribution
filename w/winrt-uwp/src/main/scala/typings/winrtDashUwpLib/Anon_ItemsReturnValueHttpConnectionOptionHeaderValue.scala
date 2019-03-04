package typings
package winrtDashUwpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpConnectionOptionHeaderValue extends js.Object {
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: scala.Double
}

object Anon_ItemsReturnValueHttpConnectionOptionHeaderValue {
  @scala.inline
  def apply(
    items: winrtDashUwpLib.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue,
    returnValue: scala.Double
  ): Anon_ItemsReturnValueHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpConnectionOptionHeaderValue]
  }
}

