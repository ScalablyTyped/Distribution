package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept encoding information used in the Accept-Encoding HTTP header on an HTTP request. */
@js.native
trait HttpContentCodingWithQualityHeaderValue extends js.Object {
  /** Gets the value of the content-coding characteristic in the Accept-Encoding HTTP header. */
  var contentCoding: String = js.native
  /** Gets the value of the qvalue attribute in the Accept-Encoding HTTP header. */
  var quality: Double = js.native
}

object HttpContentCodingWithQualityHeaderValue {
  @scala.inline
  def apply(contentCoding: String, quality: Double): HttpContentCodingWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(contentCoding = contentCoding.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpContentCodingWithQualityHeaderValue]
  }
  @scala.inline
  implicit class HttpContentCodingWithQualityHeaderValueOps[Self <: HttpContentCodingWithQualityHeaderValue] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
  
}

