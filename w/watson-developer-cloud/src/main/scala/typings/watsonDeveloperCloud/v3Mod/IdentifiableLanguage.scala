package typings.watsonDeveloperCloud.v3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** IdentifiableLanguage. */
@js.native
trait IdentifiableLanguage extends js.Object {
  /** The language code for an identifiable language. */
  var language: String = js.native
  /** The name of the identifiable language. */
  var name: String = js.native
}

object IdentifiableLanguage {
  @scala.inline
  def apply(language: String, name: String): IdentifiableLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentifiableLanguage]
  }
  @scala.inline
  implicit class IdentifiableLanguageOps[Self <: IdentifiableLanguage] (val x: Self) extends AnyVal {
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
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

