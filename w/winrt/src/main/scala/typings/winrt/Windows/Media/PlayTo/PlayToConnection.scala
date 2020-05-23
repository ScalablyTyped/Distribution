package typings.winrt.Windows.Media.PlayTo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayToConnection extends IPlayToConnection

object PlayToConnection {
  @scala.inline
  def apply(onerror: js.Any, onstatechanged: js.Any, ontransferred: js.Any, state: PlayToConnectionState): PlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror.asInstanceOf[js.Any], onstatechanged = onstatechanged.asInstanceOf[js.Any], ontransferred = ontransferred.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToConnection]
  }
}

