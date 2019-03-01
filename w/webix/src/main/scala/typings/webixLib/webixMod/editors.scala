package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait editors extends js.Object {
  @JSName("$popup")
  var $popup: js.Any
  var checkbox: java.lang.String
  var color: java.lang.String
  var combo: java.lang.String
  var date: java.lang.String
  var `inline-checkbox`: java.lang.String
  var `inline-text`: java.lang.String
  var multiselect: java.lang.String
  var password: java.lang.String
  var popup: java.lang.String
  var richselect: java.lang.String
  var select: java.lang.String
  var text: java.lang.String
}

object editors {
  @scala.inline
  def apply(
    $popup: js.Any,
    checkbox: java.lang.String,
    color: java.lang.String,
    combo: java.lang.String,
    date: java.lang.String,
    `inline-checkbox`: java.lang.String,
    `inline-text`: java.lang.String,
    multiselect: java.lang.String,
    password: java.lang.String,
    popup: java.lang.String,
    richselect: java.lang.String,
    select: java.lang.String,
    text: java.lang.String
  ): editors = {
    val __obj = js.Dynamic.literal(`inline-checkbox` = `inline-checkbox`, `inline-text` = `inline-text`)
    __obj.updateDynamic("$popup")($popup)
    __obj.updateDynamic("checkbox")(checkbox)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("combo")(combo)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("multiselect")(multiselect)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("popup")(popup)
    __obj.updateDynamic("richselect")(richselect)
    __obj.updateDynamic("select")(select)
    __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[editors]
  }
}

