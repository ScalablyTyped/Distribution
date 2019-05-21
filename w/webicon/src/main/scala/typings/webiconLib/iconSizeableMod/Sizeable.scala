package typings
package webiconLib.iconSizeableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sizeable extends js.Object {
  /**
    * The default size of the icon.
    */
  var iconSize: js.UndefOr[scala.Double] = js.undefined
}

object Sizeable {
  @scala.inline
  def apply(iconSize: scala.Int | scala.Double = null): Sizeable = {
    val __obj = js.Dynamic.literal()
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sizeable]
  }
}

