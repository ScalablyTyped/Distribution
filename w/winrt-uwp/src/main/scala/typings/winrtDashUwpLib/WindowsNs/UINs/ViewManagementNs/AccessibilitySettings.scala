package typings
package winrtDashUwpLib.WindowsNs.UINs.ViewManagementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to the high contrast accessibility settings. */
@JSGlobal("Windows.UI.ViewManagement.AccessibilitySettings")
@js.native
/** Initializes a new AccessibilitySettings object. */
class AccessibilitySettings () extends js.Object {
  /** Gets a value that indicates whether the system high contrast feature is on or off. */
  var highContrast: scala.Boolean = js.native
  /** Gets the name of the default high contrast color scheme. */
  var highContrastScheme: java.lang.String = js.native
  /** Occurs when the system high contrast feature turns on or off. */
  @JSName("onhighcontrastchanged")
  var onhighcontrastchanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccessibilitySettings, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_highcontrastchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.highcontrastchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccessibilitySettings, _]
  ): scala.Unit = js.native
  /** Occurs when the system high contrast feature turns on or off. */
  def onhighcontrastchanged(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[AccessibilitySettings]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_highcontrastchanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.highcontrastchanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[AccessibilitySettings, _]
  ): scala.Unit = js.native
}

