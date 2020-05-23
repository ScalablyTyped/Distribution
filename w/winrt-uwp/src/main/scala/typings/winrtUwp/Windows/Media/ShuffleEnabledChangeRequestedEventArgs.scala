package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ShuffleEnabledChangeRequested event. */
trait ShuffleEnabledChangeRequestedEventArgs extends js.Object {
  /** Gets a value indicating whether the request is to enable or disable shuffle. */
  var requestedShuffleEnabled: Boolean
}

object ShuffleEnabledChangeRequestedEventArgs {
  @scala.inline
  def apply(requestedShuffleEnabled: Boolean): ShuffleEnabledChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(requestedShuffleEnabled = requestedShuffleEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShuffleEnabledChangeRequestedEventArgs]
  }
}

