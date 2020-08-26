package typings.winrtUwp.Windows.Storage.Search

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Specifies the language of a property, as a BCP-47 language code. */
@js.native
trait ValueAndLanguage extends js.Object {
  /** Gets or sets the language of the property value, specified as a BCP-47 language code. */
  var language: String = js.native
  /** Gets or sets the property value for the current ValueAndLanguage . */
  var value: js.Any = js.native
}

object ValueAndLanguage {
  @scala.inline
  def apply(language: String, value: js.Any): ValueAndLanguage = {
    val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAndLanguage]
  }
  @scala.inline
  implicit class ValueAndLanguageOps[Self <: ValueAndLanguage] (val x: Self) extends AnyVal {
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
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

