package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "WSConnection")
@js.native
class WSConnection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(host: java.lang.String, port: scala.Double) = this()
  def this(host: java.lang.String, port: scala.Double, options: ConnectOptions) = this()
  var host: java.lang.String = js.native
  var options: ConnectOptions = js.native
  var path: java.lang.String = js.native
  var port: scala.Double = js.native
  var protocol: TProtocol = js.native
  var secure: scala.Boolean = js.native
  var send_pending: js.Array[nodeLib.Buffer] = js.native
  var seqId2Service: SeqId2Service = js.native
  var transport: TTransport = js.native
  var wsOptions: WSOptions = js.native
  def close(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def open(): scala.Unit = js.native
  def uri(): java.lang.String = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
}

