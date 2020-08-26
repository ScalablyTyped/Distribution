package typings.wordpressRichText.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatProps extends js.Object {
  var activeAttributes: Record[String, String] = js.native
  var isActive: Boolean = js.native
  var value: Value = js.native
  def onChange(value: Value): Unit = js.native
}

object FormatProps {
  @scala.inline
  def apply(activeAttributes: Record[String, String], isActive: Boolean, onChange: Value => Unit, value: Value): FormatProps = {
    val __obj = js.Dynamic.literal(activeAttributes = activeAttributes.asInstanceOf[js.Any], isActive = isActive.asInstanceOf[js.Any], onChange = js.Any.fromFunction1(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormatProps]
  }
  @scala.inline
  implicit class FormatPropsOps[Self <: FormatProps] (val x: Self) extends AnyVal {
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
    def setActiveAttributes(value: Record[String, String]): Self = this.set("activeAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: Value => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    @scala.inline
    def setValue(value: Value): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

