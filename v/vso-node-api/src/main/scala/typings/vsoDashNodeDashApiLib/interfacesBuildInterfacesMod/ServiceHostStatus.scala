package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceHostStatus extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "ServiceHostStatus")
@js.native
object ServiceHostStatus extends js.Object {
  /**
    * The service host is currently disconnected and not accepting commands.
    */
  @js.native
  sealed trait Offline
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ServiceHostStatus
  
  /**
    * The service host is currently connected and accepting commands.
    */
  @js.native
  sealed trait Online
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ServiceHostStatus
  
  /* 2 */ val Offline: Offline with scala.Double = js.native
  /* 1 */ val Online: Online with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.ServiceHostStatus with scala.Double
  ] = js.native
}

