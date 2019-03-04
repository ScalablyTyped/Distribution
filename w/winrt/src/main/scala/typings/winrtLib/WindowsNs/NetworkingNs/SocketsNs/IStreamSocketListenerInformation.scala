package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamSocketListenerInformation extends js.Object {
  var localPort: java.lang.String
}

object IStreamSocketListenerInformation {
  @scala.inline
  def apply(localPort: java.lang.String): IStreamSocketListenerInformation = {
    val __obj = js.Dynamic.literal(localPort = localPort)
  
    __obj.asInstanceOf[IStreamSocketListenerInformation]
  }
}

