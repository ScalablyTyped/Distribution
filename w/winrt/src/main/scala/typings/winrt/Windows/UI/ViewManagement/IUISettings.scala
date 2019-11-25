package typings.winrt.Windows.UI.ViewManagement

import typings.winrt.Windows.Foundation.Size
import typings.winrt.Windows.UI.Color
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUISettings extends js.Object {
  var animationsEnabled: Boolean
  var caretBlinkRate: Double
  var caretBrowsingEnabled: Boolean
  var caretWidth: Double
  var cursorSize: Size
  var doubleClickTime: Double
  var handPreference: HandPreference
  var messageDuration: Double
  var mouseHoverTime: Double
  var scrollBarArrowSize: Size
  var scrollBarSize: Size
  var scrollBarThumbBoxSize: Size
  def uIElementColor(desiredElement: UIElementType): Color
}

object IUISettings {
  @scala.inline
  def apply(
    animationsEnabled: Boolean,
    caretBlinkRate: Double,
    caretBrowsingEnabled: Boolean,
    caretWidth: Double,
    cursorSize: Size,
    doubleClickTime: Double,
    handPreference: HandPreference,
    messageDuration: Double,
    mouseHoverTime: Double,
    scrollBarArrowSize: Size,
    scrollBarSize: Size,
    scrollBarThumbBoxSize: Size,
    uIElementColor: UIElementType => Color
  ): IUISettings = {
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled.asInstanceOf[js.Any], caretBlinkRate = caretBlinkRate.asInstanceOf[js.Any], caretBrowsingEnabled = caretBrowsingEnabled.asInstanceOf[js.Any], caretWidth = caretWidth.asInstanceOf[js.Any], cursorSize = cursorSize.asInstanceOf[js.Any], doubleClickTime = doubleClickTime.asInstanceOf[js.Any], handPreference = handPreference.asInstanceOf[js.Any], messageDuration = messageDuration.asInstanceOf[js.Any], mouseHoverTime = mouseHoverTime.asInstanceOf[js.Any], scrollBarArrowSize = scrollBarArrowSize.asInstanceOf[js.Any], scrollBarSize = scrollBarSize.asInstanceOf[js.Any], scrollBarThumbBoxSize = scrollBarThumbBoxSize.asInstanceOf[js.Any], uIElementColor = js.Any.fromFunction1(uIElementColor))
  
    __obj.asInstanceOf[IUISettings]
  }
}

