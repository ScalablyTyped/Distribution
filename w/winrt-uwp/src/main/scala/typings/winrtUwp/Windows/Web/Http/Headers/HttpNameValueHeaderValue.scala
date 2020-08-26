package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents name and value information used in a number of HTTP headers. */
@js.native
trait HttpNameValueHeaderValue extends js.Object {
  /** Gets the name used in the HttpNameValueHeaderValue object. */
  var name: String = js.native
  /** Gets or sets the value associated with a name used in the HttpNameValueHeaderValue object. */
  var value: String = js.native
}

object HttpNameValueHeaderValue {
  @scala.inline
  def apply(name: String, value: String): HttpNameValueHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpNameValueHeaderValue]
  }
  @scala.inline
  implicit class HttpNameValueHeaderValueOps[Self <: HttpNameValueHeaderValue] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

