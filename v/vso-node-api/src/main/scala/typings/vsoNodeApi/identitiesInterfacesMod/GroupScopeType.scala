package typings.vsoNodeApi.identitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GroupScopeType extends js.Object
@JSImport("vso-node-api/interfaces/IdentitiesInterfaces", "GroupScopeType")
@js.native
object GroupScopeType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType with Double] = js.native
  
  @js.native
  sealed trait Generic extends GroupScopeType
  /* 0 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  @js.native
  sealed trait ServiceHost extends GroupScopeType
  /* 1 */ @js.native
  object ServiceHost extends TopLevel[ServiceHost with Double]
  
  @js.native
  sealed trait TeamProject extends GroupScopeType
  /* 2 */ @js.native
  object TeamProject extends TopLevel[TeamProject with Double]
}
