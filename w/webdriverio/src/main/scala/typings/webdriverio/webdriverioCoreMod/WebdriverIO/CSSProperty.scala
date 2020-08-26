package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import typings.webdriverio.anon.Alpha
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSSProperty extends js.Object {
  var parsed: js.UndefOr[Alpha] = js.native
  var property: String = js.native
  var value: js.Any = js.native
}

object CSSProperty {
  @scala.inline
  def apply(property: String, value: js.Any): CSSProperty = {
    val __obj = js.Dynamic.literal(property = property.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSSProperty]
  }
  @scala.inline
  implicit class CSSPropertyOps[Self <: CSSProperty] (val x: Self) extends AnyVal {
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
    def setProperty(value: String): Self = this.set("property", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setParsed(value: Alpha): Self = this.set("parsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParsed: Self = this.set("parsed", js.undefined)
  }
  
}

