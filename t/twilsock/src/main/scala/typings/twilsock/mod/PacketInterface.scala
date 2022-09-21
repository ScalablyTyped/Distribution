package typings.twilsock.mod

import typings.std.Record
import typings.twilsock.anon.PartialHeader
import typings.twilsock.mod.Messages.InitReply
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PacketInterface extends StObject {
  
  /* private */ val activeRequests: Any = js.native
  
  /* private */ val channel: Any = js.native
  
  /* private */ val config: Any = js.native
  
  def isConnected: Boolean = js.native
  
  def processReply(reply: ReplyType): Unit = js.native
  
  def send(header: PartialHeader): String = js.native
  def send(header: PartialHeader, payload: Context[Record[String, Any]]): String = js.native
  
  def sendClose(): Unit = js.native
  
  def sendInit(): js.Promise[InitReply] = js.native
  
  def sendWithReply(header: PartialHeader): js.Promise[PacketResponse] = js.native
  def sendWithReply(header: PartialHeader, payload: Context[Record[String, Any]]): js.Promise[PacketResponse] = js.native
  
  def shutdown(): Unit = js.native
  
  /* private */ var storeRequest: Any = js.native
}
