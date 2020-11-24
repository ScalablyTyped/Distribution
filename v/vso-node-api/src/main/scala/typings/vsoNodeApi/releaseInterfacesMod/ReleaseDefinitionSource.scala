package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ReleaseDefinitionSource extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionSource")
@js.native
object ReleaseDefinitionSource extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionSource with Double] = js.native
  
  @js.native
  sealed trait Ibiza extends ReleaseDefinitionSource
  /* 4 */ @js.native
  object Ibiza extends TopLevel[Ibiza with Double]
  
  @js.native
  sealed trait PortalExtensionApi extends ReleaseDefinitionSource
  /* 8 */ @js.native
  object PortalExtensionApi extends TopLevel[PortalExtensionApi with Double]
  
  @js.native
  sealed trait RestApi extends ReleaseDefinitionSource
  /* 1 */ @js.native
  object RestApi extends TopLevel[RestApi with Double]
  
  @js.native
  sealed trait Undefined extends ReleaseDefinitionSource
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
  @js.native
  sealed trait UserInterface extends ReleaseDefinitionSource
  /* 2 */ @js.native
  object UserInterface extends TopLevel[UserInterface with Double]
}
