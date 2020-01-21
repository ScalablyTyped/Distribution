package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", "waitUntilFree")
@js.native
object waitUntilFree extends js.Object {
  def apply(port: Double): js.Promise[Unit] = js.native
  def apply(port: Double, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}

