package typings.thrift.thriftMod

import typings.node.Buffer
import typings.node.NodeJSNs.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "WSConnection")
@js.native
class WSConnection protected () extends EventEmitter {
  def this(host: String, port: Double) = this()
  def this(host: String, port: Double, options: ConnectOptions) = this()
  var host: String = js.native
  var options: ConnectOptions = js.native
  var path: String = js.native
  var port: Double = js.native
  var protocol: TProtocol = js.native
  var secure: Boolean = js.native
  var send_pending: js.Array[Buffer] = js.native
  var seqId2Service: SeqId2Service = js.native
  var transport: TTransport = js.native
  var wsOptions: WSOptions = js.native
  def close(): Unit = js.native
  def isOpen(): Boolean = js.native
  def open(): Unit = js.native
  def uri(): String = js.native
  def write(data: Buffer): Unit = js.native
}

