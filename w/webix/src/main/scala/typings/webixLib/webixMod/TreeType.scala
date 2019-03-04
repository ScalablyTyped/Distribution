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
    checkbox: js.Function2[js.Any, js.Any, java.lang.String],
    folder: js.Function2[js.Any, js.Any, java.lang.String],
    icon: js.Function2[js.Any, js.Any, java.lang.String],
    space: js.Function2[js.Any, js.Any, java.lang.String]
  ): TreeType = {
    val __obj = js.Dynamic.literal(checkbox = checkbox, folder = folder, icon = icon, space = space)
  
    __obj.asInstanceOf[TreeType]
  }
}

