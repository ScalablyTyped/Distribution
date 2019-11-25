package typings.winrt.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketClosedEventArgs extends js.Object {
  var code: Double
  var reason: String
}

object IWebSocketClosedEventArgs {
  @scala.inline
  def apply(code: Double, reason: String): IWebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IWebSocketClosedEventArgs]
  }
}

