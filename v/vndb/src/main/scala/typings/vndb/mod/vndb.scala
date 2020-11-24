package typings.vndb.mod

import typings.node.tlsMod.TLSSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object containing the socket and methods to interact with it
  */
@js.native
trait vndb extends js.Object {
  
  /**
    * Close the connection to the VNDB API
    */
  def end(): js.Promise[Unit] = js.native
  
  var socket: TLSSocket = js.native
  
  /**
    * Send a message to the VNDB API, according to https://vndb.org/d11
    * @param message message to send to the VNDB API
    */
  def write(message: String): js.Promise[String] = js.native
}
object vndb {
  
  @scala.inline
  def apply(end: () => js.Promise[Unit], socket: TLSSocket, write: String => js.Promise[String]): vndb = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), socket = socket.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[vndb]
  }
  
  @scala.inline
  implicit class vndbOps[Self <: vndb] (val x: Self) extends AnyVal {
    
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
    def setEnd(value: () => js.Promise[Unit]): Self = this.set("end", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSocket(value: TLSSocket): Self = this.set("socket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrite(value: String => js.Promise[String]): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
