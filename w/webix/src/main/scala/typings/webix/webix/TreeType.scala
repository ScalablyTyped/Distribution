package typings.webix.webix

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeType extends js.Object {
  def checkbox(obj: js.Any, common: js.Any): String
  def folder(obj: js.Any, common: js.Any): String
  def icon(obj: js.Any, common: js.Any): String
  def space(obj: js.Any, common: js.Any): String
}

object TreeType {
  @scala.inline
  def apply(
    checkbox: (js.Any, js.Any) => String,
    folder: (js.Any, js.Any) => String,
    icon: (js.Any, js.Any) => String,
    space: (js.Any, js.Any) => String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
    __obj.asInstanceOf[TreeType]
  }
}

