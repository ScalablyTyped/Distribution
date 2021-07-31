package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupScopeType extends StObject
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType & Double] = js.native
  
  @js.native
  sealed trait Generic
    extends StObject
       with GroupScopeType
  /* 0 */ val Generic: typings.vsoNodeApi.identitiesInterfacesMod.GroupScopeType.Generic & Double = js.native
  
  @js.native
  sealed trait ServiceHost
    extends StObject
       with GroupScopeType
  /* 1 */ val ServiceHost: typings.vsoNodeApi.identitiesInterfacesMod.GroupScopeType.ServiceHost & Double = js.native
  
  @js.native
  sealed trait TeamProject
    extends StObject
       with GroupScopeType
  /* 2 */ val TeamProject: typings.vsoNodeApi.identitiesInterfacesMod.GroupScopeType.TeamProject & Double = js.native
}
