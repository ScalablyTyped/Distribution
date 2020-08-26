package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
@js.native
trait HttpLanguageRangeWithQualityHeaderValue extends js.Object {
  /** Gets the value of the language-range information from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var languageRange: String = js.native
  /** Gets the value of the qvalue or quality factor from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var quality: Double = js.native
}

object HttpLanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(languageRange: String, quality: Double): HttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRange = languageRange.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpLanguageRangeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class HttpLanguageRangeWithQualityHeaderValueOps[Self <: HttpLanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
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
    def setLanguageRange(value: String): Self = this.set("languageRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
  }
  
}

