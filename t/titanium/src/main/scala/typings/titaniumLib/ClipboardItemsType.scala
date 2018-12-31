package typings
package titaniumLib

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

