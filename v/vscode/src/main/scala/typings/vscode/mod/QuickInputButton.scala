package typings.vscode.mod

import typings.vscode.anon.Dark
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickInputButton extends js.Object {
  /**
    * Icon for the button.
    */
  val iconPath: Uri | Dark | ThemeIcon
  /**
    * An optional tooltip.
    */
  val tooltip: js.UndefOr[String] = js.undefined
}

object QuickInputButton {
  @scala.inline
  def apply(iconPath: Uri | Dark | ThemeIcon, tooltip: String = null): QuickInputButton = {
    val __obj = js.Dynamic.literal(iconPath = iconPath.asInstanceOf[js.Any])
    if (tooltip != null) __obj.updateDynamic("tooltip")(tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickInputButton]
  }
}

