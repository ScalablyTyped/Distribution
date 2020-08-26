package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Web.Http.Headers.HttpLanguageRangeWithQualityHeaderValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LanguageRangeWithQualityHeaderValue extends js.Object {
  /** The HttpLanguageRangeWithQualityHeaderValue version of the string. */ var languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue = js.native
  /** true if input is valid HttpLanguageRangeWithQualityHeaderValue information; otherwise, false. */ var returnValue: Boolean = js.native
}

object LanguageRangeWithQualityHeaderValue {
  @scala.inline
  def apply(languageRangeWithQualityHeaderValue: HttpLanguageRangeWithQualityHeaderValue, returnValue: Boolean): LanguageRangeWithQualityHeaderValue = {
    val __obj = js.Dynamic.literal(languageRangeWithQualityHeaderValue = languageRangeWithQualityHeaderValue.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageRangeWithQualityHeaderValue]
  }
  @scala.inline
  implicit class LanguageRangeWithQualityHeaderValueOps[Self <: LanguageRangeWithQualityHeaderValue] (val x: Self) extends AnyVal {
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
    def setLanguageRangeWithQualityHeaderValue(value: HttpLanguageRangeWithQualityHeaderValue): Self = this.set("languageRangeWithQualityHeaderValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnValue(value: Boolean): Self = this.set("returnValue", value.asInstanceOf[js.Any])
  }
  
}

