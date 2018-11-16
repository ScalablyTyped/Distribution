package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "Connection")
@js.native
class Connection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(stream: nodeLib.netMod.Socket) = this()
  def this(stream: nodeLib.netMod.Socket, options: ConnectOptions) = this()
  var connected: scala.Boolean = js.native
  var connection: nodeLib.netMod.Socket = js.native
  var offline_queue: js.Array[nodeLib.Buffer] = js.native
  var options: ConnectOptions = js.native
  var protocol: TProtocol = js.native
  var seqId2Service: SeqId2Service = js.native
  var ssl: scala.Boolean = js.native
  var transport: TTransport = js.native
  def connection_gone(): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def initialize_retry_vars(): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
}

