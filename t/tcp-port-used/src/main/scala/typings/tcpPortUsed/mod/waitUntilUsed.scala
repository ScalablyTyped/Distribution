package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcp-port-used", "waitUntilUsed")
@js.native
object waitUntilUsed extends js.Object {
  
  def apply(port: Double): js.Promise[Unit] = js.native
  def apply(port: Double, retryTimeMs: js.UndefOr[scala.Nothing], timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, retryTimeMs: js.UndefOr[scala.Nothing], timeOutMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = js.native
  def apply(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = js.native
}
