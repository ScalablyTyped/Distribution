package typings.toastr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ToastMap extends js.Object {
  /**
  	 * The toast icon class.
  	 */
  var iconClass: String
  /**
  	 * The toast message.
  	 */
  var message: String
  /**
  	 * Any override options specified when the toast was created.
  	 */
  var optionsOverride: js.UndefOr[ToastrOptions] = js.undefined
  /**
  	 * The toast title.
  	 */
  var title: js.UndefOr[String] = js.undefined
  /**
  	 * The toast type.
  	 */
  var `type`: ToastrType
}

object ToastMap {
  @scala.inline
  def apply(
    iconClass: String,
    message: String,
    `type`: ToastrType,
    optionsOverride: ToastrOptions = null,
    title: String = null
  ): ToastMap = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (optionsOverride != null) __obj.updateDynamic("optionsOverride")(optionsOverride.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastMap]
  }
}

