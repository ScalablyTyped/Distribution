package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ServiceStatus extends js.Object

@JSImport("vso-node-api/interfaces/LocationsInterfaces", "ServiceStatus")
@js.native
object ServiceStatus extends js.Object {
  @js.native
  sealed trait Active extends ServiceStatus
  
  @js.native
  sealed trait Assigned extends ServiceStatus
  
  @js.native
  sealed trait Moving extends ServiceStatus
  
  /* 1 */ val Active: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.ServiceStatus.Active with Double = js.native
  /* 0 */ val Assigned: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.ServiceStatus.Assigned with Double = js.native
  /* 2 */ val Moving: typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod.ServiceStatus.Moving with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceStatus with Double] = js.native
}

