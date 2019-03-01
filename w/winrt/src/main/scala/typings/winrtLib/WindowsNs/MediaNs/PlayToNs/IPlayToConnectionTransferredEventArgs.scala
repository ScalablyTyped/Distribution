package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentSource")(currentSource)
    __obj.updateDynamic("previousSource")(previousSource)
    __obj.asInstanceOf[IPlayToConnectionTransferredEventArgs]
  }
}

