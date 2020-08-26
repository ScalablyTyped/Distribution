package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPlayToConnection extends js.Object {
  var onerror: js.Any = js.native
  var onstatechanged: js.Any = js.native
  var ontransferred: js.Any = js.native
  var state: PlayToConnectionState = js.native
}

object IPlayToConnection {
  @scala.inline
  def apply(onerror: js.Any, onstatechanged: js.Any, ontransferred: js.Any, state: PlayToConnectionState): IPlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onstatechanged = onstatechanged.asInstanceOf[js.Any], ontransferred = ontransferred.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayToConnection]
  }
  @scala.inline
  implicit class IPlayToConnectionOps[Self <: IPlayToConnection] (val x: Self) extends AnyVal {
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
    def setOnerror(value: js.Any): Self = this.set("onerror", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnstatechanged(value: js.Any): Self = this.set("onstatechanged", value.asInstanceOf[js.Any])
    @scala.inline
    def setOntransferred(value: js.Any): Self = this.set("ontransferred", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: PlayToConnectionState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

