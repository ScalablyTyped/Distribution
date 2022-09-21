package typings.thrift.mod

import typings.node.bufferMod.global.Buffer
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "WSConnection")
@js.native
open class WSConnection protected () extends EventEmitter {
  def this(host: String, port: Double) = this()
  def this(host: String, port: Double, options: ConnectOptions) = this()
  
  def close(): Unit = js.native
  
  var host: String = js.native
  
  def isOpen(): Boolean = js.native
  
  def open(): Unit = js.native
  
  var options: ConnectOptions = js.native
  
  var path: String = js.native
  
  var port: Double = js.native
  
  var protocol: TProtocol = js.native
  
  var secure: Boolean = js.native
  
  var send_pending: js.Array[Buffer] = js.native
  
  var seqId2Service: SeqId2Service = js.native
  
  var transport: TTransport = js.native
  
  def uri(): String = js.native
  
  def write(data: Buffer): Unit = js.native
  
  var wsOptions: WSOptions = js.native
}
