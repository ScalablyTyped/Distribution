package typings.winrtUwp.Windows.UI.ViewManagement

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Size
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.UI.Color
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.colorvalueschanged
import typings.winrtUwp.winrtUwpStrings.textscalefactorchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a set of common app user interface settings and operations. */
@js.native
trait UISettings extends js.Object {
  /** Gets whether animations are enabled for the user interface. */
  var animationsEnabled: Boolean = js.native
  /** Gets the blink rate of a new caret created by the app view. */
  var caretBlinkRate: Double = js.native
  /** Gets whether the caret can be used for browse operations. */
  var caretBrowsingEnabled: Boolean = js.native
  /** Gets the width of a new caret created by the app view. */
  var caretWidth: Double = js.native
  /** Gets the size of a new cursor created by the app view. */
  var cursorSize: Size = js.native
  /** Gets the maximum allowed time between clicks in a double-click operation. */
  var doubleClickTime: Double = js.native
  /** Gets the directional preference of the user interface created by the app view. */
  var handPreference: HandPreference = js.native
  /** Gets the length of time a message is displayed for the app view. */
  var messageDuration: Double = js.native
  /** Gets the amount of time the mouse pointer can rest in a hover rectangle before a hover event is raised. */
  var mouseHoverTime: Double = js.native
  /** Occurs when color values have changed. */
  @JSName("oncolorvalueschanged")
  var oncolorvalueschanged_Original: TypedEventHandler[UISettings, _] = js.native
  /** Occurs when the system text size setting is changed. */
  @JSName("ontextscalefactorchanged")
  var ontextscalefactorchanged_Original: TypedEventHandler[UISettings, _] = js.native
  /** Gets the size of a scroll bar arrow for windows associated with the app view. */
  var scrollBarArrowSize: Size = js.native
  /** Gets the size of a scroll bar for windows associated with the app view. */
  var scrollBarSize: Size = js.native
  /** Gets the size of a thumb box for windows associated with the app view. */
  var scrollBarThumbBoxSize: Size = js.native
  /** Gets the value of the system text size setting. */
  var textScaleFactor: Double = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_colorvalueschanged(`type`: colorvalueschanged, listener: TypedEventHandler[UISettings, _]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_textscalefactorchanged(`type`: textscalefactorchanged, listener: TypedEventHandler[UISettings, _]): Unit = js.native
  /**
    * Returns the color value of the specified color type.
    * @param desiredColor An enumeration value that specifies the type of color to get a value for.
    * @return The color value of the specified color type.
    */
  def getColorValue(desiredColor: UIColorType): Color = js.native
  /** Occurs when color values have changed. */
  def oncolorvalueschanged(ev: js.Any with WinRTEvent[UISettings]): Unit = js.native
  /** Occurs when the system text size setting is changed. */
  def ontextscalefactorchanged(ev: js.Any with WinRTEvent[UISettings]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_colorvalueschanged(`type`: colorvalueschanged, listener: TypedEventHandler[UISettings, _]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_textscalefactorchanged(`type`: textscalefactorchanged, listener: TypedEventHandler[UISettings, _]): Unit = js.native
  /**
    * Gets the color used for a specific user interface element type, such as a button face or window text.
    * @param desiredElement The type of element for which the color will be obtained.
    * @return The color of the element type, expressed as a 32-bit color value.
    */
  def uiElementColor(desiredElement: UIElementType): Color = js.native
}

