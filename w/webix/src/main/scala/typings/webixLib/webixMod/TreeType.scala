package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeType extends js.Object {
  def checkbox(obj: js.Any, common: js.Any): java.lang.String
  def folder(obj: js.Any, common: js.Any): java.lang.String
  def icon(obj: js.Any, common: js.Any): java.lang.String
  def space(obj: js.Any, common: js.Any): java.lang.String
}

object TreeType {
  @scala.inline
  def apply(
    checkbox: (js.Any, js.Any) => java.lang.String,
    folder: (js.Any, js.Any) => java.lang.String,
    icon: (js.Any, js.Any) => java.lang.String,
    space: (js.Any, js.Any) => java.lang.String
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = js.Any.fromFunction2(checkbox), folder = js.Any.fromFunction2(folder), icon = js.Any.fromFunction2(icon), space = js.Any.fromFunction2(space))
  
    __obj.asInstanceOf[TreeType]
  }
}

