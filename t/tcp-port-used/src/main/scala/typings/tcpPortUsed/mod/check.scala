package typings.tcpPortUsed.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcp-port-used", "check")
@js.native
object check extends js.Object {
  
  def apply(port: Double): js.Promise[Boolean] = js.native
  def apply(port: Double, host: String): js.Promise[Boolean] = js.native
  def apply(port: TcpPortUsedOptions): js.Promise[Boolean] = js.native
  def apply(port: TcpPortUsedOptions, host: String): js.Promise[Boolean] = js.native
}
