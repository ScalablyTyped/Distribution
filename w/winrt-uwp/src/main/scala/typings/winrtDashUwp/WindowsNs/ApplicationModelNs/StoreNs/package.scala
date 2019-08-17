package typings.winrtDashUwp.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object StoreNs {
  import typings.winrtDashUwp.WindowsNs.WinRTEvent

  /** Represents the method that will handle the LicenseChanged event. */
  type LicenseChangedEventHandler = js.Function1[/* ev */ WinRTEvent[Unit], Unit]
}
