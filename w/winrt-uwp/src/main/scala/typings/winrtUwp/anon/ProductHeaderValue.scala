package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpProductHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductHeaderValue extends js.Object {
  /** The HttpProductHeaderValue version of the string. */ var productHeaderValue: HttpProductHeaderValue = js.native
  /** true if input is valid HttpProductHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ProductHeaderValue {
  @scala.inline
  def apply(productHeaderValue: HttpProductHeaderValue, returnValue: Boolean): ProductHeaderValue = {
    val __obj = js.Dynamic.literal(productHeaderValue = productHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductHeaderValue]
  }
  @scala.inline
  implicit class ProductHeaderValueOps[Self <: ProductHeaderValue] (val x: Self) extends AnyVal {
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
    def setProductHeaderValue(value: HttpProductHeaderValue): Self = this.set("productHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

