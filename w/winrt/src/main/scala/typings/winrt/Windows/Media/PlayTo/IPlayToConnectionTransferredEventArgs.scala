package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToConnectionTransferredEventArgs extends js.Object {
  var currentSource: PlayToSource
  var previousSource: PlayToSource
}

object IPlayToConnectionTransferredEventArgs {
  @scala.inline
  def apply(currentSource: PlayToSource, previousSource: PlayToSource): IPlayToConnectionTransferredEventArgs = {
    val __obj = js.Dynamic.literal(currentSource = currentSource, previousSource = previousSource)
  
    __obj.asInstanceOf[IPlayToConnectionTransferredEventArgs]
  }
}

