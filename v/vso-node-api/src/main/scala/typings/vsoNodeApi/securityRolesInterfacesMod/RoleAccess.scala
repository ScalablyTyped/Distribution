package typings.vsoNodeApi.securityRolesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RoleAccess extends js.Object
@JSImport("vso-node-api/interfaces/SecurityRolesInterfaces", "RoleAccess")
@js.native
object RoleAccess extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RoleAccess with Double] = js.native
  
  /**
    * Access has been explicitly set.
    */
  @js.native
  sealed trait Assigned extends RoleAccess
  /* 1 */ @js.native
  object Assigned extends TopLevel[Assigned with Double]
  
  /**
    * Access has been inherited from a higher scope.
    */
  @js.native
  sealed trait Inherited extends RoleAccess
  /* 2 */ @js.native
  object Inherited extends TopLevel[Inherited with Double]
}
