package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createSSLConnection")
@js.native
object createSSLConnection extends js.Object {
  def apply(host: js.UndefOr[String], port: Double): Connection = js.native
  def apply(host: js.UndefOr[String], port: Double, options: ConnectOptions): Connection = js.native
}

