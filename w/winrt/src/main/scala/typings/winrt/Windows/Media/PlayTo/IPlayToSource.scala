package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSource extends js.Object {
  var connection: PlayToConnection
  var next: PlayToSource
  def playNext(): Unit
}

object IPlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext))
    __obj.asInstanceOf[IPlayToSource]
  }
}

