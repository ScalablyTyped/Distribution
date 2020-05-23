package typings.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ShuffleEnabledChangeRequested event. */
@JSGlobal("Windows.Media.ShuffleEnabledChangeRequestedEventArgs")
@js.native
abstract class ShuffleEnabledChangeRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Media.ShuffleEnabledChangeRequestedEventArgs {
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  /* CompleteClass */
  override var requestedShuffleEnabled: Boolean = js.native
}

