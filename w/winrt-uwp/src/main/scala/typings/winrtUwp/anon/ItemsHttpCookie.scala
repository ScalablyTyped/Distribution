package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpCookie
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpCookie extends js.Object {
  /** The HttpCookie items that start at startIndex in the HttpCookieCollection . */ var items: HttpCookie = js.native
  /** The number of HttpCookie items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpCookie {
  @scala.inline
  def apply(items: HttpCookie, returnValue: Double): ItemsHttpCookie = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpCookie]
  }
  @scala.inline
  implicit class ItemsHttpCookieOps[Self <: ItemsHttpCookie] (val x: Self) extends AnyVal {
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
    def setItems(value: HttpCookie): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

