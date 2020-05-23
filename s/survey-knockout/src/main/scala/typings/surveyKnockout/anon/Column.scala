package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: String
  var controlLabel: String
  var item: String
  var itemChecked: String
  var itemControl: String
  var itemDecorator: String
  var itemInline: String
  var label: String
  var labelChecked: String
  var materialDecorator: String
  var other: String
  var root: String
}

object Column {
  @scala.inline
  def apply(
    column: String,
    controlLabel: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemDecorator: String,
    itemInline: String,
    label: String,
    labelChecked: String,
    materialDecorator: String,
    other: String,
    root: String
  ): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], controlLabel = controlLabel.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelChecked = labelChecked.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

