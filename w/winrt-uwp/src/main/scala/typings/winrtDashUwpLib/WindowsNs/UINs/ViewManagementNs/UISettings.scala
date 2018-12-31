package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a set of common app user interface settings and operations. */
@JSGlobal("Windows.UI.ViewManagement.UISettings")
@js.native
/** Creates a new default instance of the UISettings class. */
class UISettings () extends js.Object {
  /** Gets whether animations are enabled for the user interface. */
  var animationsEnabled: scala.Boolean = js.native
  /** Gets the blink rate of a new caret created by the app view. */
  var caretBlinkRate: scala.Double = js.native
  /** Gets whether the caret can be used for browse operations. */
  var caretBrowsingEnabled: scala.Boolean = js.native
  /** Gets the width of a new caret created by the app view. */
  var caretWidth: scala.Double = js.native
  /** Gets the size of a new cursor created by the app view. */
  var cursorSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the maximum allowed time between clicks in a double-click operation. */
  var doubleClickTime: scala.Double = js.native
  /** Gets the directional preference of the user interface created by the app view. */
  var handPreference: HandPreference = js.native
  /** Gets the length of time a message is displayed for the app view. */
  var messageDuration: scala.Double = js.native
  /** Gets the amount of time the mouse pointer can rest in a hover rectangle before a hover event is raised. */
  var mouseHoverTime: scala.Double = js.native
  /** Occurs when color values have changed. */
  @JSName("oncolorvalueschanged")
  var oncolorvalueschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _] = js.native
  /** Occurs when the system text size setting is changed. */
  @JSName("ontextscalefactorchanged")
  var ontextscalefactorchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _] = js.native
  /** Gets the size of a scroll bar arrow for windows associated with the app view. */
  var scrollBarArrowSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the size of a scroll bar for windows associated with the app view. */
  var scrollBarSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the size of a thumb box for windows associated with the app view. */
  var scrollBarThumbBoxSize: winrtDashUwpLib.WindowsNs.FoundationNs.Size = js.native
  /** Gets the value of the system text size setting. */
  var textScaleFactor: scala.Double = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorvalueschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorvalueschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _]
  ): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textscalefactorchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textscalefactorchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _]
  ): scala.Unit = js.native
  /**
    * Returns the color value of the specified color type.
    * @param desiredColor An enumeration value that specifies the type of color to get a value for.
    * @return The color value of the specified color type.
    */
  def getColorValue(desiredColor: UIColorType): winrtDashUwpLib.WindowsNs.UINs.Color = js.native
  /** Occurs when color values have changed. */
  def oncolorvalueschanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[UISettings]): scala.Unit = js.native
  /** Occurs when the system text size setting is changed. */
  def ontextscalefactorchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[UISettings]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorvalueschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.colorvalueschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _]
  ): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textscalefactorchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.textscalefactorchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[UISettings, _]
  ): scala.Unit = js.native
  /**
    * Gets the color used for a specific user interface element type, such as a button face or window text.
    * @param desiredElement The type of element for which the color will be obtained.
    * @return The color of the element type, expressed as a 32-bit color value.
    */
  def uiElementColor(desiredElement: UIElementType): winrtDashUwpLib.WindowsNs.UINs.Color = js.native
}

