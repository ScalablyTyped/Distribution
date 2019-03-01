package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketClosedEventArgs extends js.Object {
  var code: scala.Double
  var reason: java.lang.String
}

object IWebSocketClosedEventArgs {
  @scala.inline
  def apply(code: scala.Double, reason: java.lang.String): IWebSocketClosedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[IWebSocketClosedEventArgs]
  }
}

