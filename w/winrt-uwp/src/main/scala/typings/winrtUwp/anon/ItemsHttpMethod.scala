package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.HttpMethod
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemsHttpMethod extends js.Object {
  /** An array of HttpMethod items that start at startIndex in the HttpMethodHeaderValueCollection . */ var items: HttpMethod = js.native
  /** The number of items retrieved. */ var returnValue: Double = js.native
}

object ItemsHttpMethod {
  @scala.inline
  def apply(items: HttpMethod, returnValue: Double): ItemsHttpMethod = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsHttpMethod]
  }
  @scala.inline
  implicit class ItemsHttpMethodOps[Self <: ItemsHttpMethod] (val x: Self) extends AnyVal {
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
    def setItems(value: HttpMethod): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Double): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

