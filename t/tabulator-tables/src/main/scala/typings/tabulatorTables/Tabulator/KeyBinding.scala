package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyBinding extends js.Object {
  var copyToClipboard: js.UndefOr[String | Boolean] = js.undefined
  var navDown: js.UndefOr[String | Boolean] = js.undefined
  var navLeft: js.UndefOr[String | Boolean] = js.undefined
  var navNext: js.UndefOr[String | Boolean] = js.undefined
  var navPrev: js.UndefOr[String | Boolean] = js.undefined
  var navRight: js.UndefOr[String | Boolean] = js.undefined
  var navUp: js.UndefOr[String | Boolean] = js.undefined
  var redo: js.UndefOr[String | Boolean] = js.undefined
  var scrollPageDown: js.UndefOr[String | Boolean] = js.undefined
  var scrollPageUp: js.UndefOr[String | Boolean] = js.undefined
  var scrollToEnd: js.UndefOr[String | Boolean] = js.undefined
  var scrollToStart: js.UndefOr[String | Boolean] = js.undefined
  var undo: js.UndefOr[String | Boolean] = js.undefined
}

object KeyBinding {
  @scala.inline
  def apply(
    copyToClipboard: String | Boolean = null,
    navDown: String | Boolean = null,
    navLeft: String | Boolean = null,
    navNext: String | Boolean = null,
    navPrev: String | Boolean = null,
    navRight: String | Boolean = null,
    navUp: String | Boolean = null,
    redo: String | Boolean = null,
    scrollPageDown: String | Boolean = null,
    scrollPageUp: String | Boolean = null,
    scrollToEnd: String | Boolean = null,
    scrollToStart: String | Boolean = null,
    undo: String | Boolean = null
  ): KeyBinding = {
    val __obj = js.Dynamic.literal()
    if (copyToClipboard != null) __obj.updateDynamic("copyToClipboard")(copyToClipboard.asInstanceOf[js.Any])
    if (navDown != null) __obj.updateDynamic("navDown")(navDown.asInstanceOf[js.Any])
    if (navLeft != null) __obj.updateDynamic("navLeft")(navLeft.asInstanceOf[js.Any])
    if (navNext != null) __obj.updateDynamic("navNext")(navNext.asInstanceOf[js.Any])
    if (navPrev != null) __obj.updateDynamic("navPrev")(navPrev.asInstanceOf[js.Any])
    if (navRight != null) __obj.updateDynamic("navRight")(navRight.asInstanceOf[js.Any])
    if (navUp != null) __obj.updateDynamic("navUp")(navUp.asInstanceOf[js.Any])
    if (redo != null) __obj.updateDynamic("redo")(redo.asInstanceOf[js.Any])
    if (scrollPageDown != null) __obj.updateDynamic("scrollPageDown")(scrollPageDown.asInstanceOf[js.Any])
    if (scrollPageUp != null) __obj.updateDynamic("scrollPageUp")(scrollPageUp.asInstanceOf[js.Any])
    if (scrollToEnd != null) __obj.updateDynamic("scrollToEnd")(scrollToEnd.asInstanceOf[js.Any])
    if (scrollToStart != null) __obj.updateDynamic("scrollToStart")(scrollToStart.asInstanceOf[js.Any])
    if (undo != null) __obj.updateDynamic("undo")(undo.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyBinding]
  }
}

