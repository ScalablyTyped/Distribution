package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptionHeaderValue extends js.Object {
  /** The HttpConnectionOptionHeaderValue version of the string. */ var connectionOptionHeaderValue: HttpConnectionOptionHeaderValue = js.native
  /** true if input is valid HttpConnectionOptionHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object ConnectionOptionHeaderValue {
  @scala.inline
  def apply(connectionOptionHeaderValue: HttpConnectionOptionHeaderValue, returnValue: Boolean): ConnectionOptionHeaderValue = {
    val __obj = js.Dynamic.literal(connectionOptionHeaderValue = connectionOptionHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptionHeaderValue]
  }
  @scala.inline
  implicit class ConnectionOptionHeaderValueOps[Self <: ConnectionOptionHeaderValue] (val x: Self) extends AnyVal {
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
    def setConnectionOptionHeaderValue(value: HttpConnectionOptionHeaderValue): Self = this.set("connectionOptionHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

