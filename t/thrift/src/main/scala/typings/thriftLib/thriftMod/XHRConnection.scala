package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "XHRConnection")
@js.native
class XHRConnection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(host: java.lang.String, port: scala.Double) = this()
  def this(host: java.lang.String, port: scala.Double, options: ConnectOptions) = this()
  var headers: HttpHeaders = js.native
  var options: ConnectOptions = js.native
  var protocol: TProtocol = js.native
  var recv_buf: java.lang.String = js.native
  var rpos: scala.Double = js.native
  var send_buf: java.lang.String = js.native
  var seqId2Service: SeqId2Service = js.native
  var transport: TTransport = js.native
  var useCORS: scala.Boolean = js.native
  var wpos: scala.Double = js.native
  def close(): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def getSendBuffer(): java.lang.String = js.native
  def getXmlHttpRequestObject(): stdLib.XMLHttpRequest = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def read(len: scala.Double): java.lang.String = js.native
  def readAll(): java.lang.String = js.native
  def setRecvBuffer(buf: java.lang.String): scala.Unit = js.native
  def write(buf: java.lang.String): scala.Unit = js.native
}

