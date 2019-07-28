package typings.webix.webixMod

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
    val __obj = js.Dynamic.literal($popup = $popup, checkbox = checkbox, color = color, combo = combo, date = date, multiselect = multiselect, password = password, popup = popup, richselect = richselect, select = select, text = text)
    __obj.updateDynamic("inline-checkbox")(`inline-checkbox`)
    __obj.updateDynamic("inline-text")(`inline-text`)
    __obj.asInstanceOf[editors]
  }
}

