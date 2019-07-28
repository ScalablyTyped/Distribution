package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpConnectionOptionHeaderValue extends js.Object {
  /** An array of HttpConnectionOptionHeaderValue items that start at startIndex in the HttpConnectionOptionHeaderValueCollection . */ var items: HttpConnectionOptionHeaderValue
  /** The number of HttpConnectionOptionHeaderValue items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpConnectionOptionHeaderValue {
  @scala.inline
  def apply(items: HttpConnectionOptionHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpConnectionOptionHeaderValue]
  }
}

