package typings.vsoDashNodeDashApi.interfacesIdentitiesInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupScopeType with Double] = js.native
  /* 0 */ @js.native
  object Generic extends TopLevel[Generic with Double]
  
  /* 1 */ @js.native
  object ServiceHost extends TopLevel[ServiceHost with Double]
  
  /* 2 */ @js.native
  object TeamProject extends TopLevel[TeamProject with Double]
  
}

