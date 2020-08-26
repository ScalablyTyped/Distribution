package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisabledLabel extends js.Object {
  var control: String = js.native
  var disabledLabel: String = js.native
  var item: String = js.native
  var itemChecked: String = js.native
  var itemDisabled: String = js.native
  var itemIndeterminate: String = js.native
  var label: String = js.native
  var root: String = js.native
  var slider: String = js.native
  var small: String = js.native
  var switch: String = js.native
}

object DisabledLabel {
  @scala.inline
  def apply(
    control: String,
    disabledLabel: String,
    item: String,
    itemChecked: String,
    itemDisabled: String,
    itemIndeterminate: String,
    label: String,
    root: String,
    slider: String,
    small: String,
    switch: String
  ): DisabledLabel = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], disabledLabel = disabledLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemIndeterminate = itemIndeterminate.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisabledLabel]
  }
  @scala.inline
  implicit class DisabledLabelOps[Self <: DisabledLabel] (val x: Self) extends AnyVal {
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
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabledLabel(value: String): Self = this.set("disabledLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemDisabled(value: String): Self = this.set("itemDisabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIndeterminate(value: String): Self = this.set("itemIndeterminate", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def setSlider(value: String): Self = this.set("slider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: String): Self = this.set("small", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitch(value: String): Self = this.set("switch", value.asInstanceOf[js.Any])
  }
  
}

