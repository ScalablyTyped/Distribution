package typings
package toastrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastMap extends js.Object {
  /**
  	 * The toast icon class.
  	 */
  var iconClass: java.lang.String
  /**
  	 * The toast message.
  	 */
  var message: java.lang.String
  /**
  	 * Any override options specified when the toast was created.
  	 */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.undefined
  /**
  	 * The toast title.
  	 */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /**
  	 * The toast type.
  	 */
  var `type`: ToastrType
}

object ToastMap {
  @scala.inline
  def apply(
    iconClass: java.lang.String,
    message: java.lang.String,
    `type`: ToastrType,
    optionsOverride: ToastrOptions = null,
    title: java.lang.String = null
  ): ToastMap = {
    val __obj = js.Dynamic.literal(iconClass = iconClass, message = message)
    __obj.updateDynamic("type")(`type`)
    if (optionsOverride != null) __obj.updateDynamic("optionsOverride")(optionsOverride)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ToastMap]
  }
}

