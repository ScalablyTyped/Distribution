package typings
package winrtDashUwpLib.WindowsNs.MediaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object DevicesNs {
  /** Handles the AnswerRequested and AudioTransferRequested events. */
  type CallControlEventHandler = js.Function1[/* ev */ winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl], scala.Unit]
  /** Handles the DialRequested event. */
  type DialRequestedEventHandler = js.Function1[
    /* ev */ DialRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl], 
    scala.Unit
  ]
  /** Handles the KeypadPressed event. */
  type KeypadPressedEventHandler = js.Function1[
    /* ev */ KeypadPressedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl], 
    scala.Unit
  ]
  /** Handles the RedialRequested event. */
  type RedialRequestedEventHandler = js.Function1[
    /* ev */ RedialRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[CallControl], 
    scala.Unit
  ]
}
