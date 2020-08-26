package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToSource extends js.Object {
  var connection: PlayToConnection = js.native
  var next: PlayToSource = js.native
  def playNext(): Unit = js.native
}

object IPlayToSource {
  @scala.inline
  def apply(connection: PlayToConnection, next: PlayToSource, playNext: () => Unit): IPlayToSource = {
    val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], playNext = js.Any.fromFunction0(playNext))
    __obj.asInstanceOf[IPlayToSource]
  }
  @scala.inline
  implicit class IPlayToSourceOps[Self <: IPlayToSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnection(value: PlayToConnection): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def setNext(value: PlayToSource): Self = this.set("next", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayNext(value: () => Unit): Self = this.set("playNext", js.Any.fromFunction0(value))
  }
  
}

