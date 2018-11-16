package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a dismissal event and image location information for the app's splash screen. */
@JSGlobal("Windows.ApplicationModel.Activation.SplashScreen")
@js.native
abstract class SplashScreen () extends js.Object {
  /** The coordinates of the app's splash screen image relative to the window. */
  var imageLocation: winrtDashUwpLib.WindowsNs.FoundationNs.Rect = js.native
  /** Fires when the app's splash screen is dismissed. */
  @JSName("ondismissed")
  var ondismissed_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SplashScreen, _] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SplashScreen, _]
  ): scala.Unit = js.native
  /** Fires when the app's splash screen is dismissed. */
  def ondismissed(ev: js.Any with winrtDashUwpLib.WindowsNs.WinRTEvent[SplashScreen]): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.dismissed,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[SplashScreen, _]
  ): scala.Unit = js.native
}

