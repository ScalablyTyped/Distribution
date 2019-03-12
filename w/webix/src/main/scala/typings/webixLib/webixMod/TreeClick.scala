package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeClick extends js.Object {
  def webix_tree_checkbox(obj: js.Any, common: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
  def webix_tree_close(obj: js.Any, common: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
  def webix_tree_open(obj: js.Any, common: org.scalablytyped.runtime.StringDictionary[js.Any]): java.lang.String
}

object TreeClick {
  @scala.inline
  def apply(
    webix_tree_checkbox: (js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]) => java.lang.String,
    webix_tree_close: (js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]) => java.lang.String,
    webix_tree_open: (js.Any, org.scalablytyped.runtime.StringDictionary[js.Any]) => java.lang.String
  ): TreeClick = {
    val __obj = js.Dynamic.literal(webix_tree_checkbox = js.Any.fromFunction2(webix_tree_checkbox), webix_tree_close = js.Any.fromFunction2(webix_tree_close), webix_tree_open = js.Any.fromFunction2(webix_tree_open))
  
    __obj.asInstanceOf[TreeClick]
  }
}

