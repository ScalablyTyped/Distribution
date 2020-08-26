package typings.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwixStatic extends js.Object {
  var formatTemplate: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.native
}

object TwixStatic {
  @scala.inline
  def apply(): TwixStatic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixStatic]
  }
  @scala.inline
  implicit class TwixStaticOps[Self <: TwixStatic] (val x: Self) extends AnyVal {
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
    def setFormatTemplate(value: (/* left */ js.Any, /* right */ js.Any) => _): Self = this.set("formatTemplate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFormatTemplate: Self = this.set("formatTemplate", js.undefined)
  }
  
}

