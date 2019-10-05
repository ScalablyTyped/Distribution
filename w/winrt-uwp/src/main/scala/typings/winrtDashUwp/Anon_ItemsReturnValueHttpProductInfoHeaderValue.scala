package typings.winrtDashUwp

import typings.winrtDashUwp.Windows.Web.Http.Headers.HttpProductInfoHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpProductInfoHeaderValue extends js.Object {
  /** An array of HttpProductInfoHeaderValue items that start at startIndex in the HttpProductInfoHeaderValueCollection . */ var items: HttpProductInfoHeaderValue
  /** The number of items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpProductInfoHeaderValue {
  @scala.inline
  def apply(items: HttpProductInfoHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpProductInfoHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpProductInfoHeaderValue]
  }
}

