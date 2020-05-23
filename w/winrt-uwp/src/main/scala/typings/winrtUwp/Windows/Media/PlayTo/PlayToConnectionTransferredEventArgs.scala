package typings.winrtUwp.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the Transferred event. */
trait PlayToConnectionTransferredEventArgs extends js.Object {
  /** Gets the current Play To source that a connection was transferred to. */
  var currentSource: PlayToSource
  /** Gets the previous Play To source that a connection was transferred from. */
  var previousSource: PlayToSource
}

object PlayToConnectionTransferredEventArgs {
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): PlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionTransferredEventArgs]
  }
}

