package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickInputButton extends js.Object {
  /**
  		 * Icon for the button.
  		 */
  val iconPath: Uri | vscodeLib.Anon_DarkLight | ThemeIcon
  /**
  		 * An optional tooltip.
  		 */
  val tooltip: js.UndefOr[java.lang.String] = js.undefined
}

object QuickInputButton {
  @scala.inline
  def apply(iconPath: Uri | vscodeLib.Anon_DarkLight | ThemeIcon, tooltip: java.lang.String = null): QuickInputButton = {
    val __obj = js.Dynamic.literal(iconPath = iconPath.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[QuickInputButton]
  }
}

