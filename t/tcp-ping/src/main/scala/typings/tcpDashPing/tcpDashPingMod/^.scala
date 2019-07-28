package typings.tcpDashPing.tcpDashPingMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-ping", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def ping(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = js.native
  def probe(
    address: String,
    port: Double,
    callback: js.Function2[/* error */ Error, /* result */ Result, Unit]
  ): Unit = js.native
}

