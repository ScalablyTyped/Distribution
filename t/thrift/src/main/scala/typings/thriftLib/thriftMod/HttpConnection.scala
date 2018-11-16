package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "HttpConnection")
@js.native
class HttpConnection protected ()
  extends nodeLib.NodeJSNs.EventEmitter {
  def this(host: java.lang.String, port: scala.Double) = this()
  def this(host: java.lang.String, port: scala.Double, options: ConnectOptions) = this()
  var host: java.lang.String = js.native
  var https: scala.Boolean = js.native
  var options: ConnectOptions = js.native
  var port: scala.Double = js.native
  var protocol: TProtocol = js.native
  var transport: TTransport = js.native
  def responseCallback(response: nodeLib.httpMod.IncomingMessage): scala.Unit = js.native
  def write(data: nodeLib.Buffer): scala.Unit = js.native
}

