package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RelativeToSetting extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "RelativeToSetting")
@js.native
object RelativeToSetting extends js.Object {
  @js.native
  sealed trait Context
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.RelativeToSetting
  
  @js.native
  sealed trait FullyQualified
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.RelativeToSetting
  
  @js.native
  sealed trait WebApplication
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.RelativeToSetting
  
  /* 0 */ val Context: Context with scala.Double = js.native
  /* 3 */ val FullyQualified: FullyQualified with scala.Double = js.native
  /* 2 */ val WebApplication: WebApplication with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.RelativeToSetting with scala.Double
  ] = js.native
}

