package typings.winrtDashUwp.Windows.Networking

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Connectivity {
  import typings.winrtDashUwp.Windows.WinRTEvent

  /** Represents the method that handles network status change notifications. This method is called when any properties exposed by the NetworkInformation object changes while the app is active. */
  type NetworkStatusChangedEventHandler = js.Function1[/* ev */ WinRTEvent[js.Any], Unit]
}
