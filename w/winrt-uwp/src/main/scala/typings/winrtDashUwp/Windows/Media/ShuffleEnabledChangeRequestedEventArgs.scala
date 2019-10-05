package typings.winrtDashUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ShuffleEnabledChangeRequested event. */
@JSGlobal("Windows.Media.ShuffleEnabledChangeRequestedEventArgs")
@js.native
abstract class ShuffleEnabledChangeRequestedEventArgs () extends js.Object {
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  var requestedShuffleEnabled: Boolean = js.native
}

