package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IClosable
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IWebSocket extends IClosable {
  var onclosed: js.Any = js.native
  var outputStream: IOutputStream = js.native
  def close(code: Double, reason: String): Unit = js.native
  def connectAsync(uri: Uri): IAsyncAction = js.native
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

