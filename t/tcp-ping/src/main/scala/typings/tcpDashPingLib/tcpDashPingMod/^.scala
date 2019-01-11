package typings
package tcpDashPingLib.tcpDashPingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-ping", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ping(
    options: tcpDashPingLib.tcpDashPingMod.Options,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* result */ tcpDashPingLib.tcpDashPingMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def probe(
    address: java.lang.String,
    port: scala.Double,
    callback: js.Function2[
      /* error */ stdLib.Error, 
      /* result */ tcpDashPingLib.tcpDashPingMod.Result, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

