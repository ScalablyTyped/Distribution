package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocket
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var onclosed: js.Any = js.native
  var outputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def close(code: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def connectAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def setRequestHeader(headerName: java.lang.String, headerValue: java.lang.String): scala.Unit = js.native
}

