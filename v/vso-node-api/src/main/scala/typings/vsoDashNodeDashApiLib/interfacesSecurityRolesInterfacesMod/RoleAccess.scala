package typings
package vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RoleAccess extends js.Object

@JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "RoleAccess")
@js.native
object RoleAccess extends js.Object {
  /**
    * Access has been explicitly set.
    */
  @js.native
  sealed trait Assigned
    extends vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAccess
  
  /**
    * Access has been inherited from a higher scope.
    */
  @js.native
  sealed trait Inherited
    extends vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAccess
  
  /* 1 */ val Assigned: Assigned with scala.Double = js.native
  /* 2 */ val Inherited: Inherited with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesSecurityRolesInterfacesMod.RoleAccess with scala.Double
  ] = js.native
}

