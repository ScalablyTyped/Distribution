package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckBox extends js.Object {
  var checkBox: scala.Double = js.native
  var combo: scala.Double = js.native
  var none: scala.Double = js.native
  var passwordBox: scala.Double = js.native
  var radioButtons: scala.Double = js.native
  var textArea: scala.Double = js.native
  var textBox: scala.Double = js.native
}

object CheckBox {
  @scala.inline
  def apply(
    checkBox: scala.Double,
    combo: scala.Double,
    none: scala.Double,
    passwordBox: scala.Double,
    radioButtons: scala.Double,
    textArea: scala.Double,
    textBox: scala.Double
  ): CheckBox = {
    val __obj = js.Dynamic.literal(checkBox = checkBox.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], passwordBox = passwordBox.asInstanceOf[js.Any], radioButtons = radioButtons.asInstanceOf[js.Any], textArea = textArea.asInstanceOf[js.Any], textBox = textBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBox]
  }
  @scala.inline
  implicit class CheckBoxOps[Self <: CheckBox] (val x: Self) extends AnyVal {
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
    def setCheckBox(value: scala.Double): Self = this.set("checkBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setCombo(value: scala.Double): Self = this.set("combo", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPasswordBox(value: scala.Double): Self = this.set("passwordBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setRadioButtons(value: scala.Double): Self = this.set("radioButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextArea(value: scala.Double): Self = this.set("textArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setTextBox(value: scala.Double): Self = this.set("textBox", value.asInstanceOf[js.Any])
  }
  
}

