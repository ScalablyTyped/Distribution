package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the CurrentTimeChangeRequested event. */
trait CurrentTimeChangeRequestedEventArgs extends js.Object {
  /** Gets the new time that the Play To source audio or video stream has been changed to. */
  var time: Double
}

object CurrentTimeChangeRequestedEventArgs {
  @scala.inline
  def apply(time: Double): CurrentTimeChangeRequestedEventArgs = {
    val __obj = js.Dynamic.literal(time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentTimeChangeRequestedEventArgs]
  }
}

