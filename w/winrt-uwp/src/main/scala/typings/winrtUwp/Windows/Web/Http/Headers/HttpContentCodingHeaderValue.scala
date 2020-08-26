package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents content encoding information used in the Content-Encoding HTTP header on HTTP content in a request or a response. */
@js.native
trait HttpContentCodingHeaderValue extends js.Object {
  /** Gets the value of the content-coding information used in the Content-Encoding HTTP header. */
  var contentCoding: String = js.native
}

object HttpContentCodingHeaderValue {
  @scala.inline
  def apply(contentCoding: String): HttpContentCodingHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingHeaderValue]
  }
  @scala.inline
  implicit class HttpContentCodingHeaderValueOps[Self <: HttpContentCodingHeaderValue] (val x: Self) extends AnyVal {
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
    def setContentCoding(value: String): Self = this.set("contentCoding", value.asInstanceOf[js.Any])
  }
  
}

