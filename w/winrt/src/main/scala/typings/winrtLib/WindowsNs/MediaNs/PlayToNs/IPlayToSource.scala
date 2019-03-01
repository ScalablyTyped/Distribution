package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSource extends js.Object {
  var connection: PlayToConnection
  var next: PlayToSource
  def playNext(): scala.Unit
}

object IPlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: js.Function0[scala.Unit]): IPlayToSource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("connection")(connection)
    __obj.updateDynamic("next")(next)
    __obj.updateDynamic("playNext")(playNext)
    __obj.asInstanceOf[IPlayToSource]
  }
}

