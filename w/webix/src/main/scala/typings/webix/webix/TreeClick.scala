package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeClick extends js.Object {
  def webix_tree_checkbox(obj: js.Any, common: StringDictionary[js.Any]): String
  def webix_tree_close(obj: js.Any, common: StringDictionary[js.Any]): String
  def webix_tree_open(obj: js.Any, common: StringDictionary[js.Any]): String
}

object TreeClick {
  @scala.inline
  def apply(
    webix_tree_checkbox: (js.Any, StringDictionary[js.Any]) => String,
    webix_tree_close: (js.Any, StringDictionary[js.Any]) => String,
    webix_tree_open: (js.Any, StringDictionary[js.Any]) => String
  ): TreeClick = {
    val __obj = js.Dynamic.literal(webix_tree_checkbox = js.Any.fromFunction2(webix_tree_checkbox), webix_tree_close = js.Any.fromFunction2(webix_tree_close), webix_tree_open = js.Any.fromFunction2(webix_tree_open))
    __obj.asInstanceOf[TreeClick]
  }
}

