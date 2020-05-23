package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemsHttpNameValueHeaderValue extends js.Object {
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double
}

object ItemsHttpNameValueHeaderValue {
  @scala.inline
  def apply(items: HttpNameValueHeaderValue, returnValue: Double): ItemsHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpNameValueHeaderValue]
  }
}

