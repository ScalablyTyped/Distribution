package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.dismissed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a dismissal event and image location information for the app's splash screen. */
@js.native
trait SplashScreen extends js.Object {
  /** The coordinates of the app's splash screen image relative to the window. */
  var imageLocation: Rect = js.native
  /** Fires when the app's splash screen is dismissed. */
  @JSName("ondismissed")
  var ondismissed_Original: TypedEventHandler[SplashScreen, _] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, _]): Unit = js.native
  /** Fires when the app's splash screen is dismissed. */
  def ondismissed(ev: js.Any with WinRTEvent[SplashScreen]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_dismissed(`type`: dismissed, listener: TypedEventHandler[SplashScreen, _]): Unit = js.native
}

