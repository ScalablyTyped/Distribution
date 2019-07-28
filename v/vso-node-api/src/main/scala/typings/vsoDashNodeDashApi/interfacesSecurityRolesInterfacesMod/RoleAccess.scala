package typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod

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
  sealed trait Assigned extends RoleAccess
  
  /**
    * Access has been inherited from a higher scope.
    */
  @js.native
  sealed trait Inherited extends RoleAccess
  
  /* 1 */ val Assigned: typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.RoleAccess.Assigned with Double = js.native
  /* 2 */ val Inherited: typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.RoleAccess.Inherited with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleAccess with Double] = js.native
}

