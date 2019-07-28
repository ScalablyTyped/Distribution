package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupScopeType extends js.Object

@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends js.Object {
  @js.native
  sealed trait Generic extends GroupScopeType
  
  @js.native
  sealed trait ServiceHost extends GroupScopeType
  
  @js.native
  sealed trait TeamProject extends GroupScopeType
  
  /* 0 */ val Generic: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.Generic with Double = js.native
  /* 1 */ val ServiceHost: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.ServiceHost with Double = js.native
  /* 2 */ val TeamProject: typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod.GroupScopeType.TeamProject with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType with Double] = js.native
}

