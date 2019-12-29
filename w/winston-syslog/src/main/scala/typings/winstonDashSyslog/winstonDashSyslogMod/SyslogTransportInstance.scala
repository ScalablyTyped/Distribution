package typings.winstonDashSyslog.winstonDashSyslogMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.dgramMod.Socket
import typings.winstonDashSyslog.winstonDashSyslogBooleans.`true`
import typings.winstonDashTransport.winstonDashTransportMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogTransportInstance
  extends ^
     with Instantiable0[SyslogTransportInstance]
     with Instantiable1[/* options */ SyslogTransportOptions, SyslogTransportInstance] {
  var producer: js.Any = js.native
  var socket: Socket | typings.node.netMod.Socket = js.native
  @JSName("connect")
  def connect_true(callback: js.Function1[/* err */ `true` | Null, _]): Unit = js.native
}

