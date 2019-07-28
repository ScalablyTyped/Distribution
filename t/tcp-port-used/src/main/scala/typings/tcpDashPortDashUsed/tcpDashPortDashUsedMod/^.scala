package typings.tcpDashPortDashUsed.tcpDashPortDashUsedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(port: Double): js.Promise[Boolean] = js.native
  def check(port: Double, host: String): js.Promise[Boolean] = js.native
  def check(port: TcpPortUsedOptions): js.Promise[Boolean] = js.native
  def check(port: TcpPortUsedOptions, host: String): js.Promise[Boolean] = js.native
  def waitForStatus(port: Double): js.Promise[Unit] = js.native
  def waitForStatus(port: Double, host: String): js.Promise[Unit] = js.native
  def waitForStatus(port: Double, host: String, inUse: Boolean): js.Promise[Unit] = js.native
  def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean): js.Promise[Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilFree(port: Double): js.Promise[Unit] = js.native
  def waitUntilFree(port: Double, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilFree(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: Double): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: Double, host: String): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsed(port: Double): js.Promise[Unit] = js.native
  def waitUntilUsed(port: Double, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsed(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: Double): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: Double, host: String): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}

