package typings.tcpPortUsed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tcp-port-used", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def check(port: Double): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def check(port: Double, host: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  inline def check(port: TcpPortUsedOptions): js.Promise[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Boolean]]
  inline def check(port: TcpPortUsedOptions, host: String): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def waitForStatus(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: String, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: Double, host: Unit, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: String, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Boolean, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitForStatus(port: TcpPortUsedOptions, host: Unit, inUse: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitForStatus")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], inUse.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilFree(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: Double, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: Double, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFree(port: TcpPortUsedOptions, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFree")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilFreeOnHost(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: Double, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilFreeOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilFreeOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilUsed(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: Double, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: Double, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: Double, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsed(port: TcpPortUsedOptions, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsed")(port.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def waitUntilUsedOnHost(port: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: Double, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: String, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Double, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def waitUntilUsedOnHost(port: TcpPortUsedOptions, host: Unit, retryTimeMs: Unit, timeOutMs: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("waitUntilUsedOnHost")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], retryTimeMs.asInstanceOf[js.Any], timeOutMs.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait TcpPortUsedOptions extends StObject {
    
    var host: js.UndefOr[String] = js.undefined
    
    var port: Double
    
    var retryTimeMs: js.UndefOr[Double] = js.undefined
    
    var status: js.UndefOr[Boolean] = js.undefined
    
    var timeOutMs: js.UndefOr[Double] = js.undefined
  }
  object TcpPortUsedOptions {
    
    inline def apply(port: Double): TcpPortUsedOptions = {
      val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
      __obj.asInstanceOf[TcpPortUsedOptions]
    }
    
    extension [Self <: TcpPortUsedOptions](x: Self) {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeMs(value: Double): Self = StObject.set(x, "retryTimeMs", value.asInstanceOf[js.Any])
      
      inline def setRetryTimeMsUndefined: Self = StObject.set(x, "retryTimeMs", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTimeOutMs(value: Double): Self = StObject.set(x, "timeOutMs", value.asInstanceOf[js.Any])
      
      inline def setTimeOutMsUndefined: Self = StObject.set(x, "timeOutMs", js.undefined)
    }
  }
}
