package typings
package winstonDashSyslogLib.winstonDashSyslogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyslogTransportInstance
  extends winstonDashTransportLib.winstonDashTransportMod.namespaced
     with ScalablyTyped.runtime.Instantiable0[SyslogTransportInstance]
     with ScalablyTyped.runtime.Instantiable1[/* options */ SyslogTransportOptions, SyslogTransportInstance] {
  var producer: js.Any = js.native
  var socket: nodeLib.dgramMod.Socket | nodeLib.netMod.Socket = js.native
  def connect(
    callback: js.Function1[/* err */ winstonDashSyslogLib.winstonDashSyslogLibNumbers.`true` | scala.Null, _]
  ): scala.Unit = js.native
}

