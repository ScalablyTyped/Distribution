package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuickPickItem extends js.Object {
  /**
  		 * Always show this item.
  		 */
  var alwaysShow: js.UndefOr[scala.Boolean] = js.undefined
  /**
  		 * A human readable string which is rendered less prominent.
  		 */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * A human readable string which is rendered less prominent.
  		 */
  var detail: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * A human readable string which is rendered prominent.
  		 */
  var label: java.lang.String
  /**
  		 * Optional flag indicating if this item is picked initially.
  		 * (Only honored when the picker allows multiple selections.)
  		 *
  		 * @see [QuickPickOptions.canPickMany](#QuickPickOptions.canPickMany)
  		 */
  var picked: js.UndefOr[scala.Boolean] = js.undefined
}

object QuickPickItem {
  @scala.inline
  def apply(
    label: java.lang.String,
    alwaysShow: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    detail: java.lang.String = null,
    picked: js.UndefOr[scala.Boolean] = js.undefined
  ): QuickPickItem = {
    val __obj = js.Dynamic.literal(label = label)
    if (!js.isUndefined(alwaysShow)) __obj.updateDynamic("alwaysShow")(alwaysShow)
    if (description != null) __obj.updateDynamic("description")(description)
    if (detail != null) __obj.updateDynamic("detail")(detail)
    if (!js.isUndefined(picked)) __obj.updateDynamic("picked")(picked)
    __obj.asInstanceOf[QuickPickItem]
  }
}

