package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPickItem extends js.Object {
  /**
  		 * Always show this item.
  		 */
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  /**
  		 * A human-readable string which is rendered less prominent in the same line. Supports rendering of
  		 * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
  		 */
  var description: js.UndefOr[String] = js.undefined
  /**
  		 * A human-readable string which is rendered less prominent in a separate line. Supports rendering of
  		 * [theme icons](#ThemeIcon) via the `$(<name>)`-syntax.
  		 */
  var detail: js.UndefOr[String] = js.undefined
  /**
  		 * A human-readable string which is rendered prominent. Supports rendering of [theme icons](#ThemeIcon) via
  		 * the `$(<name>)`-syntax.
  		 */
  var label: String
  /**
  		 * Optional flag indicating if this item is picked initially.
  		 * (Only honored when the picker allows multiple selections.)
  		 *
  		 * @see [QuickPickOptions.canPickMany](#QuickPickOptions.canPickMany)
  		 */
  var picked: js.UndefOr[Boolean] = js.undefined
}

object QuickPickItem {
  @scala.inline
  def apply(
    label: String,
    alwaysShow: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    detail: String = null,
    picked: js.UndefOr[Boolean] = js.undefined
  ): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (detail != null) __obj.updateDynamic("detail")(detail.asInstanceOf[js.Any])
    if (!js.isUndefined(picked)) __obj.updateDynamic("picked")(picked.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickPickItem]
  }
}

