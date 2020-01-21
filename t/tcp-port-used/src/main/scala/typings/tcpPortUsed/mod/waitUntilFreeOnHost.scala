package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", "waitUntilFreeOnHost")
@js.native
object waitUntilFreeOnHost extends js.Object {
  def apply(port: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}

