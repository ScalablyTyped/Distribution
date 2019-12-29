package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeToSetting extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "RelativeToSetting")
@js.native
object RelativeToSetting extends js.Object {
  @js.native
  sealed trait Context extends RelativeToSetting
  
  @js.native
  sealed trait FullyQualified extends RelativeToSetting
  
  @js.native
  sealed trait WebApplication extends RelativeToSetting
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeToSetting with Double] = js.native
  /* 0 */ @js.native
  object Context extends TopLevel[Context with Double]
  
  /* 3 */ @js.native
  object FullyQualified extends TopLevel[FullyQualified with Double]
  
  /* 2 */ @js.native
  object WebApplication extends TopLevel[WebApplication with Double]
  
}

