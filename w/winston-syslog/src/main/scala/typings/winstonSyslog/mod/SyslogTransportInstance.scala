package typings.winstonSyslog.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.dgramMod.Socket
import typings.winstonSyslog.winstonSyslogBooleans.`true`
import typings.winstonTransport.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SyslogTransportInstance
  extends ^
     with Instantiable0[SyslogTransportInstance]
     with Instantiable1[/* options */ SyslogTransportOptions, SyslogTransportInstance] {
  
  @JSName("connect")
  def connect_true(callback: js.Function1[/* err */ `true` | Null, _]): Unit = js.native
  
  var producer: js.Any = js.native
  
  var socket: Socket | typings.node.netMod.Socket = js.native
}
