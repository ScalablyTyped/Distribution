package typings.thrift.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("thrift", "createHttpConnection")
@js.native
object createHttpConnection extends js.Object {
  def apply(host: js.UndefOr[String], port: Double): HttpConnection = js.native
  def apply(host: js.UndefOr[String], port: Double, options: ConnectOptions): HttpConnection = js.native
}

