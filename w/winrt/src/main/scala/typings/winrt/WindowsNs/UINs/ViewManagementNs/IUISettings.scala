package typings.winrt.WindowsNs.UINs.ViewManagementNs

import typings.winrt.WindowsNs.FoundationNs.Size
import typings.winrt.WindowsNs.UINs.Color
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
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled, caretBlinkRate = caretBlinkRate, caretBrowsingEnabled = caretBrowsingEnabled, caretWidth = caretWidth, cursorSize = cursorSize, doubleClickTime = doubleClickTime, handPreference = handPreference, messageDuration = messageDuration, mouseHoverTime = mouseHoverTime, scrollBarArrowSize = scrollBarArrowSize, scrollBarSize = scrollBarSize, scrollBarThumbBoxSize = scrollBarThumbBoxSize, uIElementColor = js.Any.fromFunction1(uIElementColor))
  
    __obj.asInstanceOf[IUISettings]
  }
}

