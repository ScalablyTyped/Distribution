package typings.vsoDashNodeDashApi.interfacesLocationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceStatus with Double] = js.native
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  /* 0 */ @js.native
  object Assigned extends TopLevel[Assigned with Double]
  
  /* 2 */ @js.native
  object Moving extends TopLevel[Moving with Double]
  
}

