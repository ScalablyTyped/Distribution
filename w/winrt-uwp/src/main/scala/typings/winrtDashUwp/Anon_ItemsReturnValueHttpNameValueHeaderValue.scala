package typings.winrtDashUwp

import typings.winrtDashUwp.WindowsNs.WebNs.HttpNs.HeadersNs.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemsReturnValueHttpNameValueHeaderValue extends js.Object {
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double
}

object Anon_ItemsReturnValueHttpNameValueHeaderValue {
  @scala.inline
  def apply(items: HttpNameValueHeaderValue, returnValue: Double): Anon_ItemsReturnValueHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items, returnValue = returnValue)
  
    __obj.asInstanceOf[Anon_ItemsReturnValueHttpNameValueHeaderValue]
  }
}

