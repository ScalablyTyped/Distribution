package typings.thrift.mod

import typings.node.eventsMod.EventEmitter
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "XHRConnection")
@js.native
class XHRConnection protected () extends EventEmitter {
  def this(host: String, port: Double) = this()
  def this(host: String, port: Double, options: ConnectOptions) = this()
  
  def close(): Unit = js.native
  
  def flush(): Unit = js.native
  
  def getSendBuffer(): String = js.native
  
  def getXmlHttpRequestObject(): XMLHttpRequest = js.native
  
  var headers: HttpHeaders = js.native
  
  def isOpen(): Boolean = js.native
  
  def open(): Unit = js.native
  
  var options: ConnectOptions = js.native
  
  var protocol: TProtocol = js.native
  
  def read(len: Double): String = js.native
  
  def readAll(): String = js.native
  
  var recv_buf: String = js.native
  
  var rpos: Double = js.native
  
  var send_buf: String = js.native
  
  var seqId2Service: SeqId2Service = js.native
  
  def setRecvBuffer(buf: String): Unit = js.native
  
  var transport: TTransport = js.native
  
  var useCORS: Boolean = js.native
  
  var wpos: Double = js.native
  
  def write(buf: String): Unit = js.native
}
