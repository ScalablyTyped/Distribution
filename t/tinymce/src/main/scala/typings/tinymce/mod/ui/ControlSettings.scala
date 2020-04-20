package typings.tinymce.mod.ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ControlSettings extends js.Object {
  var menu: Menu
}

object ControlSettings {
  @scala.inline
  def apply(menu: Menu): ControlSettings = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlSettings]
  }
}

