package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpExpectationHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpExpectationHeaderValue extends js.Object {
  /** An array of HttpExpectationHeaderValue items that start at startIndex in the HttpExpectationHeaderValueCollection . */ var items: HttpExpectationHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpExpectationHeaderValue {
  @scala.inline
  def apply(items: HttpExpectationHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpExpectationHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpExpectationHeaderValue]
  }
}

