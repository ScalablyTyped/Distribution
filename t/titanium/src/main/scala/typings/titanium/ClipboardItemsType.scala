package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dictionary describing the items for <Titanium.UI.Clipboard.setItems>.
  */
trait ClipboardItemsType extends js.Object {
  /**
  	 * An array of key-value items to add to the clipboard. The key must a valid mime-type
  	 * matching the mime-type of the value.
  	 */
  var items: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * The privacy options to apply to all the items on the clipboard. The available options are
  	 * described in `Ti.UI.CLIPBOARD_OPTION_*`. Depending on the key, the value can be a Date or
  	 * Boolean.
  	 */
  var options: js.UndefOr[js.Any] = js.undefined
}

object ClipboardItemsType {
  @scala.inline
  def apply(items: js.Array[_] = null, options: js.Any = null): ClipboardItemsType = {
    val __obj = js.Dynamic.literal()
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClipboardItemsType]
  }
}

