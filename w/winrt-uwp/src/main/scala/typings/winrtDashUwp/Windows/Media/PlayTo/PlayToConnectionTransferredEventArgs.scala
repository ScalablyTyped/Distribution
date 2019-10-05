package typings.winrtDashUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Transferred event. */
@JSGlobal("Windows.Media.PlayTo.PlayToConnectionTransferredEventArgs")
@js.native
abstract class PlayToConnectionTransferredEventArgs () extends js.Object {
  /** Gets the current Play To source that a connection was transferred to. */
  var currentSource: PlayToSource = js.native
  /** Gets the previous Play To source that a connection was transferred from. */
  var previousSource: PlayToSource = js.native
}

