package typings.winrtDashUwp.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProtectionNs {
  import typings.winrtDashUwp.WindowsNs.WinRTEvent

  /** Represents the method that handles the data passed by the MediaProtectionManager when a load of binary data fails. */
  type ComponentLoadFailedEventHandler = js.Function1[
    /* ev */ ComponentLoadFailedEventArgs with WinRTEvent[MediaProtectionManager], 
    Unit
  ]
  /** Represents the method that handles the data passed by the MediaProtectionManager that requires a reboot. */
  type RebootNeededEventHandler = js.Function1[/* ev */ WinRTEvent[MediaProtectionManager], Unit]
  /** Represents the method that handles the data passed by the MediaProtectionManager when the resume operation is completed. */
  type ServiceRequestedEventHandler = js.Function1[/* ev */ ServiceRequestedEventArgs with WinRTEvent[MediaProtectionManager], Unit]
}
