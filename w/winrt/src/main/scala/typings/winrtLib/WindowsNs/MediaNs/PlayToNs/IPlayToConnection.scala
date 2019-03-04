package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToConnection extends js.Object {
  var onerror: js.Any
  var onstatechanged: js.Any
  var ontransferred: js.Any
  var state: PlayToConnectionState
}

object IPlayToConnection {
  @scala.inline
  def apply(onerror: js.Any, onstatechanged: js.Any, ontransferred: js.Any, state: PlayToConnectionState): IPlayToConnection = {
    val __obj = js.Dynamic.literal(onerror = onerror, onstatechanged = onstatechanged, ontransferred = ontransferred, state = state)
  
    __obj.asInstanceOf[IPlayToConnection]
  }
}

