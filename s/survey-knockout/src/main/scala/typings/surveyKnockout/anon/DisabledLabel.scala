package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisabledLabel extends js.Object {
  var control: String
  var disabledLabel: String
  var item: String
  var itemChecked: String
  var itemDisabled: String
  var itemIndeterminate: String
  var label: String
  var root: String
  var slider: String
  var small: String
  var switch: String
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
}

