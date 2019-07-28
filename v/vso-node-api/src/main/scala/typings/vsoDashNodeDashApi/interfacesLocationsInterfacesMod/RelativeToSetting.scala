package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

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
  
  /* 0 */ val Context: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.RelativeToSetting.Context with Double = js.native
  /* 3 */ val FullyQualified: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.RelativeToSetting.FullyQualified with Double = js.native
  /* 2 */ val WebApplication: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.RelativeToSetting.WebApplication with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RelativeToSetting with Double] = js.native
}

