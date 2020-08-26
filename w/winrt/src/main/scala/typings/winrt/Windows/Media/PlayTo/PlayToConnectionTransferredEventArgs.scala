package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlayToConnectionTransferredEventArgs extends IPlayToConnectionTransferredEventArgs

object PlayToConnectionTransferredEventArgs {
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): PlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource.asInstanceOf[js.Any], previousSource = previousSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnectionTransferredEventArgs]
  }
}

