package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", "waitUntilUsedOnHost")
@js.native
object waitUntilUsedOnHost extends js.Object {
  def apply(port: Double): js.Promise[Unit] = js.native
  def apply(
    port: Double,
    host: js.UndefOr[scala.Nothing],
    retryTimeMs: js.UndefOr[scala.Nothing],
    timeOutMs: Double
  ): js.Promise[Unit] = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: js.UndefOr[scala.Nothing], retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, retryTimeMs: js.UndefOr[scala.Nothing], timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def apply(
    port: TcpPortUsedOptions,
    host: js.UndefOr[scala.Nothing],
    retryTimeMs: js.UndefOr[scala.Nothing],
    timeOutMs: Double
  ): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: js.UndefOr[scala.Nothing], retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: js.UndefOr[scala.Nothing], retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, retryTimeMs: js.UndefOr[scala.Nothing], timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}

