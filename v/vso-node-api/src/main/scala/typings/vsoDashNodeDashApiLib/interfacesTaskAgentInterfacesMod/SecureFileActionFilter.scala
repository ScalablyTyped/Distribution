package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecureFileActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "SecureFileActionFilter")
@js.native
object SecureFileActionFilter extends js.Object {
  @js.native
  sealed trait Manage
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFileActionFilter
  
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFileActionFilter
  
  @js.native
  sealed trait Use
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFileActionFilter
  
  /* 2 */ val Manage: Manage with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 16 */ val Use: Use with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.SecureFileActionFilter with scala.Double
  ] = js.native
}

