package typings.tcpPortUsed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tcp-port-used", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def check(port: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def check(port: Double, host: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def check(port: TcpPortUsedOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  @scala.inline
  def check(port: TcpPortUsedOptions, host: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  @scala.inline
  def waitForStatus(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitUntilFree(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: Double, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: Double, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitUntilFreeOnHost(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitUntilUsed(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: Double, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: Double, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def waitUntilUsedOnHost(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  @scala.inline
  def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait TcpPortUsedOptions extends StObject {
    
    var host: String
    
    var port: Double
    
    var retryTimeMs: Double
    
    var status: Boolean
    
    var timeOutMs: Double
  }
  object TcpPortUsedOptions {
    
    @scala.inline
    def apply(host: String, port: Double, retryTimeMs: Double, status: Boolean, timeOutMs: Double): TcpPortUsedOptions = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], retryTimeMs = retryTimeMs.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timeOutMs = timeOutMs.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpPortUsedOptions]
    }
    
    @scala.inline
    implicit class TcpPortUsedOptionsMutableBuilder[Self <: TcpPortUsedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryTimeMs(value: Double): Self = StObject.set(x, "retryTimeMs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeOutMs(value: Double): Self = StObject.set(x, "timeOutMs", value.asInstanceOf[js.Any])
    }
  }
}
