package typings.winrtUwp.Windows.Web.Http.Headers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents accept language information used in the Accept-Language HTTP header on an HTTP request. */
trait HttpLanguageRangeWithQualityHeaderValue extends js.Object {
  /** Gets the value of the language-range information from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var languageRange: String
  /** Gets the value of the qvalue or quality factor from the HttpLanguageRangeWithQualityHeaderValue used in the Accept-Language HTTP header. */
  var quality: Double
}

object HttpLanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(languageRange: String, quality: Double): HttpLanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRange = languageRange.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpLanguageRangeWithQualityHeaderValue]
  }
}

