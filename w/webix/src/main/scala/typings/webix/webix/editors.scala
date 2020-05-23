package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editors extends js.Object {
  @JSName("$popup")
  var $popup: js.Any
  var checkbox: String
  var color: String
  var combo: String
  var date: String
  var `inline-checkbox`: String
  var `inline-text`: String
  var multiselect: String
  var password: String
  var popup: String
  var richselect: String
  var select: String
  var text: String
}

object editors {
  @scala.inline
  def apply(
    $popup: js.Any,
    checkbox: String,
    color: String,
    combo: String,
    date: String,
    `inline-checkbox`: String,
    `inline-text`: String,
    multiselect: String,
    password: String,
    popup: String,
    richselect: String,
    select: String,
    text: String
  ): editors = {
    val __obj = js.Dynamic.literal($popup = $popup.asInstanceOf[js.Any], checkbox = checkbox.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], combo = combo.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], multiselect = multiselect.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], richselect = richselect.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-checkbox")(`inline-checkbox`.asInstanceOf[js.Any])
    __obj.updateDynamic("inline-text")(`inline-text`.asInstanceOf[js.Any])
    __obj.asInstanceOf[editors]
  }
}

