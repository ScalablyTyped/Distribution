package typings
package vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceStatus extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "ServiceStatus")
@js.native
object ServiceStatus extends js.Object {
  @js.native
  sealed trait Active
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceStatus
  
  @js.native
  sealed trait Assigned
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceStatus
  
  @js.native
  sealed trait Moving
    extends vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceStatus
  
  /* 1 */ val Active: Active with scala.Double = js.native
  /* 0 */ val Assigned: Assigned with scala.Double = js.native
  /* 2 */ val Moving: Moving with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesLocationsInterfacesMod.ServiceStatus with scala.Double
  ] = js.native
}

