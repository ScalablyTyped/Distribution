package typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.RoleAccess.Assigned
import typings.vsoDashNodeDashApi.interfacesSecurityRolesInterfacesMod.RoleAccess.Inherited
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleAccess with Double] = js.native
  /* 1 */ @js.native
  object Assigned extends TopLevel[Assigned with Double]
  
  /* 2 */ @js.native
  object Inherited extends TopLevel[Inherited with Double]
  
}

