package typings
package vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupScopeType extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends js.Object {
  @js.native
  sealed trait Generic
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.GroupScopeType
  
  @js.native
  sealed trait ServiceHost
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.GroupScopeType
  
  @js.native
  sealed trait TeamProject
    extends vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.GroupScopeType
  
  /* 0 */ val Generic: Generic with scala.Double = js.native
  /* 1 */ val ServiceHost: ServiceHost with scala.Double = js.native
  /* 2 */ val TeamProject: TeamProject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesIdentitiesInterfacesMod.GroupScopeType with scala.Double
  ] = js.native
}

