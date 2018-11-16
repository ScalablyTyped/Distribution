package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ProtectionNs {
  /** Represents the method that handles the data passed by the MediaProtectionManager when a load of binary data fails. */
  type ComponentLoadFailedEventHandler = js.Function1[
    /* ev */ ComponentLoadFailedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager], 
    scala.Unit
  ]
  /** Represents the method that handles the data passed by the MediaProtectionManager that requires a reboot. */
  type RebootNeededEventHandler = js.Function1[/* ev */ winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager], scala.Unit]
  /** Represents the method that handles the data passed by the MediaProtectionManager when the resume operation is completed. */
  type ServiceRequestedEventHandler = js.Function1[
    /* ev */ ServiceRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[MediaProtectionManager], 
    scala.Unit
  ]
}
