package typings
package winrtLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUISettings extends js.Object {
  var animationsEnabled: scala.Boolean
  var caretBlinkRate: scala.Double
  var caretBrowsingEnabled: scala.Boolean
  var caretWidth: scala.Double
  var cursorSize: winrtLib.WindowsNs.FoundationNs.Size
  var doubleClickTime: scala.Double
  var handPreference: HandPreference
  var messageDuration: scala.Double
  var mouseHoverTime: scala.Double
  var scrollBarArrowSize: winrtLib.WindowsNs.FoundationNs.Size
  var scrollBarSize: winrtLib.WindowsNs.FoundationNs.Size
  var scrollBarThumbBoxSize: winrtLib.WindowsNs.FoundationNs.Size
  def uIElementColor(desiredElement: UIElementType): winrtLib.WindowsNs.UINs.Color
}

object IUISettings {
  @scala.inline
  def apply(
    animationsEnabled: scala.Boolean,
    caretBlinkRate: scala.Double,
    caretBrowsingEnabled: scala.Boolean,
    caretWidth: scala.Double,
    cursorSize: winrtLib.WindowsNs.FoundationNs.Size,
    doubleClickTime: scala.Double,
    handPreference: HandPreference,
    messageDuration: scala.Double,
    mouseHoverTime: scala.Double,
    scrollBarArrowSize: winrtLib.WindowsNs.FoundationNs.Size,
    scrollBarSize: winrtLib.WindowsNs.FoundationNs.Size,
    scrollBarThumbBoxSize: winrtLib.WindowsNs.FoundationNs.Size,
    uIElementColor: js.Function1[UIElementType, winrtLib.WindowsNs.UINs.Color]
  ): IUISettings = {
    val __obj = js.Dynamic.literal(animationsEnabled = animationsEnabled, caretBlinkRate = caretBlinkRate, caretBrowsingEnabled = caretBrowsingEnabled, caretWidth = caretWidth, cursorSize = cursorSize, doubleClickTime = doubleClickTime, handPreference = handPreference, messageDuration = messageDuration, mouseHoverTime = mouseHoverTime, scrollBarArrowSize = scrollBarArrowSize, scrollBarSize = scrollBarSize, scrollBarThumbBoxSize = scrollBarThumbBoxSize, uIElementColor = uIElementColor)
  
    __obj.asInstanceOf[IUISettings]
  }
}

