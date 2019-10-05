package typings.thrift.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createConnection")
@js.native
object createConnection extends js.Object {
  def apply(host: js.UndefOr[scala.Nothing], port: Double): Connection = js.native
  def apply(host: js.UndefOr[scala.Nothing], port: Double, options: ConnectOptions): Connection = js.native
  def apply(host: String, port: Double): Connection = js.native
  def apply(host: String, port: Double, options: ConnectOptions): Connection = js.native
}

