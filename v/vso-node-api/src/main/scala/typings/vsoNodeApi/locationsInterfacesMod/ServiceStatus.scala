package typings.vsoNodeApi.locationsInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ServiceStatus extends js.Object
@JSImport("vso-node-api/interfaces/LocationsInterfaces", "ServiceStatus")
@js.native
object ServiceStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ServiceStatus with Double] = js.native
  
  @js.native
  sealed trait Active extends ServiceStatus
  /* 1 */ @js.native
  object Active extends TopLevel[Active with Double]
  
  @js.native
  sealed trait Assigned extends ServiceStatus
  /* 0 */ @js.native
  object Assigned extends TopLevel[Assigned with Double]
  
  @js.native
  sealed trait Moving extends ServiceStatus
  /* 2 */ @js.native
  object Moving extends TopLevel[Moving with Double]
}
