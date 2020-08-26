package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpNameValueHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NameValueHeaderValue extends js.Object {
  /** The HttpNameValueHeaderValue version of the string. */ var nameValueHeaderValue: HttpNameValueHeaderValue = js.native
  /** true if input is valid HttpNameValueHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object NameValueHeaderValue {
  @scala.inline
  def apply(nameValueHeaderValue: HttpNameValueHeaderValue, returnValue: Boolean): NameValueHeaderValue = {
    val __obj = js.Dynamic.literal(nameValueHeaderValue = nameValueHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameValueHeaderValue]
  }
  @scala.inline
  implicit class NameValueHeaderValueOps[Self <: NameValueHeaderValue] (val x: Self) extends AnyVal {
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
    def setNameValueHeaderValue(value: HttpNameValueHeaderValue): Self = this.set("nameValueHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

