package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpNameValueHeaderValue extends js.Object {
  /** An array of HttpNameValueHeaderValue items that start at startIndex in the HttpCacheDirectiveHeaderValueCollection . */ var items: HttpNameValueHeaderValue = js.native
  /** The number of HttpNameValueHeaderValue items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpNameValueHeaderValue {
  @scala.inline
  def apply(items: HttpNameValueHeaderValue, returnValue: Double): ItemsHttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpNameValueHeaderValue]
  }
  @scala.inline
  implicit class ItemsHttpNameValueHeaderValueOps[Self <: ItemsHttpNameValueHeaderValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setItems(value: HttpNameValueHeaderValue): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

