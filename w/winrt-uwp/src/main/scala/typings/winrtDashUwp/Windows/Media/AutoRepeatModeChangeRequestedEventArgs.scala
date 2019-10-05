package typings.winrtDashUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the AutoRepeatModeChangeRequested event. */
@JSGlobal("Windows.Media.AutoRepeatModeChangeRequestedEventArgs")
@js.native
abstract class AutoRepeatModeChangeRequestedEventArgs () extends js.Object {
  /** Gets a value indicating the requested auto-repeat mode. */
  var requestedAutoRepeatMode: MediaPlaybackAutoRepeatMode = js.native
}

