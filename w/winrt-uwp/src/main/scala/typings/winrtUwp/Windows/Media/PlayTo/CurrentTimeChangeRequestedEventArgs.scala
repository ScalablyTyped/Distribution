package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the CurrentTimeChangeRequested event. */
@JSGlobal("Windows.Media.PlayTo.CurrentTimeChangeRequestedEventArgs")
@js.native
abstract class CurrentTimeChangeRequestedEventArgs () extends js.Object {
  /** Gets the new time that the Play To source audio or video stream has been changed to. */
  var time: Double = js.native
}

