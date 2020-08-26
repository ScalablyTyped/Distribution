package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents product information used by the HttpProductHeaderValue and HttpProductInfoHeaderValueCollection classes in the User-Agent HTTP header. */
@js.native
trait HttpProductHeaderValue extends js.Object {
  /** Gets a token that represents the name of the product to be used in the User-Agent HTTP header. */
  var name: String = js.native
  /** Gets a token that represents the version of the product to be used in the User-Agent HTTP header. */
  var version: String = js.native
}

object HttpProductHeaderValue {
  @scala.inline
  def apply(name: String, version: String): HttpProductHeaderValue = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProductHeaderValue]
  }
  @scala.inline
  implicit class HttpProductHeaderValueOps[Self <: HttpProductHeaderValue] (val x: Self) extends AnyVal {
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
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

