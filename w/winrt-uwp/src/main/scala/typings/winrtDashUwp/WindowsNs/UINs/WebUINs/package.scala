package typings.winrtDashUwp.WindowsNs.UINs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs.IActivatedEventArgs
import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ISuspendingEventArgs
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUINs {
  /** Represents a method that handles the app activation event. */
  type ActivatedEventHandler = js.Function1[/* ev */ IActivatedEventArgs with WinRTEvent[_], Unit]
  /** Represents a method that handles the app navigation event. */
  type NavigatedEventHandler = js.Function1[/* ev */ IWebUINavigatedEventArgs with WinRTEvent[_], Unit]
  /** Represents a method that handles the app resumption event. */
  type ResumingEventHandler = js.Function1[/* ev */ WinRTEvent[js.Any], Unit]
  /** Represents a method that handles the app suspension event. */
  type SuspendingEventHandler = js.Function1[/* ev */ ISuspendingEventArgs with WinRTEvent[_], Unit]
}
