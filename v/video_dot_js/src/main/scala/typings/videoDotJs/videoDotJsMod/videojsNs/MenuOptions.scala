package typings.videoDotJs.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuOptions extends ComponentOptions {
  var menuButton: MenuButton
}

object MenuOptions {
  @scala.inline
  def apply(menuButton: MenuButton, children: js.Array[Child] = null): MenuOptions = {
    val __obj = js.Dynamic.literal(menuButton = menuButton)
    if (children != null) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[MenuOptions]
  }
}

