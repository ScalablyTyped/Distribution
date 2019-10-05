package typings.winrtDashUwp.Windows.Networking.Sockets

import typings.winrtDashUwp.Windows.Foundation.IClosable
import typings.winrtDashUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtDashUwp.Windows.Foundation.Uri
import typings.winrtDashUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides access to network communication that allows reading and writing using a WebSocket. */
@js.native
trait IWebSocket extends IClosable {
  /** Gets the output stream to write to the remote network destination on a IWebSocket object. */
  var outputStream: IOutputStream = js.native
  /**
    * Closes the IWebSocket .
    * @param code Status code indicating the reason for closure.
    * @param reason Optional UTF-8-encoded data with additional information about the closure.
    */
  def close(code: Double, reason: String): Unit = js.native
  /**
    * Starts an asynchronous operation to connect to a remote network destination on a IWebSocket object.
    * @param uri An absolute Uri for the server to connect to.
    * @return An asynchronous connect operation on a IWebSocket object.
    */
  def connectAsync(uri: Uri): IPromiseWithIAsyncAction = js.native
  /**
    * Adds an HTTP request header to the HTTP request message used in the WebSocket protocol handshake by the IWebSocket object.
    * @param headerName The name of the request header.
    * @param headerValue The value of the request header.
    */
  def setRequestHeader(headerName: String, headerValue: String): Unit = js.native
}

