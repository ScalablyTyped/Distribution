package typings
package tcpDashPortDashUsedLib.tcpDashPortDashUsedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tcp-port-used", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def check(port: scala.Double): js.Promise[scala.Boolean] = js.native
  def check(port: scala.Double, host: java.lang.String): js.Promise[scala.Boolean] = js.native
  def check(port: TcpPortUsedOptions): js.Promise[scala.Boolean] = js.native
  def check(port: TcpPortUsedOptions, host: java.lang.String): js.Promise[scala.Boolean] = js.native
  def waitForStatus(port: scala.Double): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: scala.Double, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: scala.Double, host: java.lang.String, inUse: scala.Boolean): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: scala.Double, host: java.lang.String, inUse: scala.Boolean, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitForStatus(
    port: scala.Double,
    host: java.lang.String,
    inUse: scala.Boolean,
    retryTimeMs: scala.Double,
    timeOutMs: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: java.lang.String, inUse: scala.Boolean): js.Promise[scala.Unit] = js.native
  def waitForStatus(port: TcpPortUsedOptions, host: java.lang.String, inUse: scala.Boolean, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitForStatus(
    port: TcpPortUsedOptions,
    host: java.lang.String,
    inUse: scala.Boolean,
    retryTimeMs: scala.Double,
    timeOutMs: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: scala.Double, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: scala.Double, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: scala.Double, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: scala.Double, host: java.lang.String, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: scala.Double, host: java.lang.String, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: java.lang.String, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilFreeOnHost(
    port: TcpPortUsedOptions,
    host: java.lang.String,
    retryTimeMs: scala.Double,
    timeOutMs: scala.Double
  ): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: scala.Double, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: scala.Double, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: scala.Double, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: scala.Double, host: java.lang.String, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: scala.Double, host: java.lang.String, retryTimeMs: scala.Double, timeOutMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: java.lang.String): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: java.lang.String, retryTimeMs: scala.Double): js.Promise[scala.Unit] = js.native
  def waitUntilUsedOnHost(
    port: TcpPortUsedOptions,
    host: java.lang.String,
    retryTimeMs: scala.Double,
    timeOutMs: scala.Double
  ): js.Promise[scala.Unit] = js.native
}

