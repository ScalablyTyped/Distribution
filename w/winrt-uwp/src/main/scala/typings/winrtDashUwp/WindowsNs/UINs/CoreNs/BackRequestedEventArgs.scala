package typings.winrtDashUwp.WindowsNs.UINs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event data for the SystemNavigationManager.BackRequested event. */
@JSGlobal("Windows.UI.Core.BackRequestedEventArgs")
@js.native
abstract class BackRequestedEventArgs () extends js.Object {
  /** Gets or sets a value that indicates whether the app performed the requested back-navigation. */
  var handled: Boolean = js.native
}

