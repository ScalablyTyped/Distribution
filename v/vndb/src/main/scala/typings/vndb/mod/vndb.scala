package typings.vndb.mod

import typings.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Object containing the socket and methods to interact with it
  */
trait vndb extends js.Object {
  var socket: TLSSocket
  /**
    * Close the connection to the VNDB API
    */
  def end(): js.Promise[Unit]
  /**
    * Send a message to the VNDB API, according to https://vndb.org/d11
    * @param message message to send to the VNDB API
    */
  def write(message: String): js.Promise[String]
}

object vndb {
  @scala.inline
  def apply(end: () => js.Promise[Unit], socket: TLSSocket, write: String => js.Promise[String]): vndb = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), socket = socket.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[vndb]
  }
}

