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

