package typings
package winrtDashUwpLib.WindowsNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object WebUINs {
  /** Represents a method that handles the app activation event. */
  type ActivatedEventHandler = js.Function1[
    /* ev */ winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs.IActivatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_], 
    scala.Unit
  ]
  /** Represents a method that handles the app navigation event. */
  type NavigatedEventHandler = js.Function1[
    /* ev */ IWebUINavigatedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_], 
    scala.Unit
  ]
  /** Represents a method that handles the app resumption event. */
  type ResumingEventHandler = js.Function1[/* ev */ winrtDashUwpLib.WindowsNs.WinRTEvent[js.Any], scala.Unit]
  /** Represents a method that handles the app suspension event. */
  type SuspendingEventHandler = js.Function1[
    /* ev */ winrtDashUwpLib.WindowsNs.ApplicationModelNs.ISuspendingEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[_], 
    scala.Unit
  ]
}
