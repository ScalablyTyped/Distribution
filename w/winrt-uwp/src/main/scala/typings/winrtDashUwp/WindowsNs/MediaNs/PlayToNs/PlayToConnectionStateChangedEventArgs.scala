package typings.winrtDashUwp.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the StateChanged event. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionStateChangedEventArgs")
@js.native
abstract class PlayToConnectionStateChangedEventArgs () extends js.Object {
  /** Gets the current state after the Play To connection state has changed. */
  var currentState: PlayToConnectionState = js.native
  /** Gets the previous state before the Play To connection state was changed. */
  var previousState: PlayToConnectionState = js.native
}

