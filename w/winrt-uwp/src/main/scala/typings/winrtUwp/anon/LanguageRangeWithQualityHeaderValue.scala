package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LanguageRangeWithQualityHeaderValue extends js.Object {
  /** The HttpLanguageRangeWithQualityHeaderValue version of the string. */ var languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue
  /** true if input is valid HttpLanguageRangeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean
}

object LanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue, returnValue: Boolean): LanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRangeWithQualityHeaderValue = languageRangeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRangeWithQualityHeaderValue]
  }
}

