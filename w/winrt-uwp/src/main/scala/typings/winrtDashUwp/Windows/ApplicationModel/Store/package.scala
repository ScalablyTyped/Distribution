package typings.winrtDashUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object Store {
  import typings.winrtDashUwp.Windows.WinRTEvent

  /** Represents the method that will handle the LicenseChanged event. */
  type LicenseChangedEventHandler = js.Function1[/* ev */ WinRTEvent[Unit], Unit]
}
