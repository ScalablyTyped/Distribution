package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ReleaseDefinitionSource extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "ReleaseDefinitionSource")
@js.native
object ReleaseDefinitionSource extends js.Object {
  @js.native
  sealed trait Ibiza extends ReleaseDefinitionSource
  
  @js.native
  sealed trait PortalExtensionApi extends ReleaseDefinitionSource
  
  @js.native
  sealed trait RestApi extends ReleaseDefinitionSource
  
  @js.native
  sealed trait Undefined extends ReleaseDefinitionSource
  
  @js.native
  sealed trait UserInterface extends ReleaseDefinitionSource
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ReleaseDefinitionSource with Double] = js.native
  /* 4 */ @js.native
  object Ibiza extends TopLevel[Ibiza with Double]
  
  /* 8 */ @js.native
  object PortalExtensionApi extends TopLevel[PortalExtensionApi with Double]
  
  /* 1 */ @js.native
  object RestApi extends TopLevel[RestApi with Double]
  
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
  
  /* 2 */ @js.native
  object UserInterface extends TopLevel[UserInterface with Double]
  
}

