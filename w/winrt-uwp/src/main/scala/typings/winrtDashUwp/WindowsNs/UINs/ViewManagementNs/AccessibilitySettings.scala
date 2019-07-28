package typings.winrtDashUwp.WindowsNs.UINs.ViewManagementNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.highcontrastchanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the high contrast accessibility settings. */
@JSGlobal("Windows.UI.ViewManagement.AccessibilitySettings")
@js.native
/** Initializes a new AccessibilitySettings object. */
class AccessibilitySettings () extends js.Object {
  /** Gets a value that indicates whether the system high contrast feature is on or off. */
  var highContrast: Boolean = js.native
  /** Gets the name of the default high contrast color scheme. */
  var highContrastScheme: String = js.native
  /** Occurs when the system high contrast feature turns on or off. */
  @JSName("onhighcontrastchanged")
  var onhighcontrastchanged_Original: TypedEventHandler[AccessibilitySettings, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highcontrastchanged(`type`: highcontrastchanged, listener: TypedEventHandler[AccessibilitySettings, _]): Unit = js.native
  /** Occurs when the system high contrast feature turns on or off. */
  def onhighcontrastchanged(ev: js.Any with WinRTEvent[AccessibilitySettings]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_highcontrastchanged(`type`: highcontrastchanged, listener: TypedEventHandler[AccessibilitySettings, _]): Unit = js.native
}

