package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguage extends js.Object {
  var displayName: String = js.native
  var languageTag: String = js.native
  var nativeName: String = js.native
  var script: String = js.native
}

object ILanguage {
  @scala.inline
  def apply(displayName: String, languageTag: String, nativeName: String, script: String): ILanguage = {
    val __obj = js.Dynamic.literal(displayName = displayName.asInstanceOf[js.Any], languageTag = languageTag.asInstanceOf[js.Any], nativeName = nativeName.asInstanceOf[js.Any], script = script.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILanguage]
  }
  @scala.inline
  implicit class ILanguageOps[Self <: ILanguage] (val x: Self) extends AnyVal {
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLanguageTag(value: String): Self = this.set("languageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setNativeName(value: String): Self = this.set("nativeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setScript(value: String): Self = this.set("script", value.asInstanceOf[js.Any])
  }
  
}

