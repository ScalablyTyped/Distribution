package typings.tcpDashPortDashUsed.tcpDashPortDashUsedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", "waitForStatus")
@js.native
object waitForStatus extends js.Object {
  def apply(port: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, inUse: Boolean): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, inUse: Boolean): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}

