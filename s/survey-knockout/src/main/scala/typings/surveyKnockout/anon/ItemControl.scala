package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemControl extends js.Object {
  var clearButton: String
  var image: String
  var item: String
  var itemChecked: String
  var itemControl: String
  var itemInline: String
  var itemText: String
  var label: String
  var root: String
}

object ItemControl {
  @scala.inline
  def apply(
    clearButton: String,
    image: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemInline: String,
    itemText: String,
    label: String,
    root: String
  ): ItemControl = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemControl]
  }
}

