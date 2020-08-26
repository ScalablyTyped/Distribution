package typings.winrt.Windows.Globalization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILanguageStatics extends js.Object {
  var currentInputMethodLanguageTag: String = js.native
  def isWellFormed(languageTag: String): Boolean = js.native
}

object ILanguageStatics {
  @scala.inline
  def apply(currentInputMethodLanguageTag: String, isWellFormed: String => Boolean): ILanguageStatics = {
    val __obj = js.Dynamic.literal(currentInputMethodLanguageTag = currentInputMethodLanguageTag.asInstanceOf[js.Any], isWellFormed = js.Any.fromFunction1(isWellFormed))
    __obj.asInstanceOf[ILanguageStatics]
  }
  @scala.inline
  implicit class ILanguageStaticsOps[Self <: ILanguageStatics] (val x: Self) extends AnyVal {
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
    def setCurrentInputMethodLanguageTag(value: String): Self = this.set("currentInputMethodLanguageTag", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsWellFormed(value: String => Boolean): Self = this.set("isWellFormed", js.Any.fromFunction1(value))
  }
  
}

