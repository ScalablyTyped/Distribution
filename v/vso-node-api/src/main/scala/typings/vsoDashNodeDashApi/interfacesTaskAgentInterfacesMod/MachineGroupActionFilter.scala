package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MachineGroupActionFilter extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MachineGroupActionFilter")
@js.native
object MachineGroupActionFilter extends js.Object {
  @js.native
  sealed trait Manage extends MachineGroupActionFilter
  
  @js.native
  sealed trait None extends MachineGroupActionFilter
  
  @js.native
  sealed trait Use extends MachineGroupActionFilter
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MachineGroupActionFilter with Double] = js.native
  /* 2 */ @js.native
  object Manage extends TopLevel[Manage with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 16 */ @js.native
  object Use extends TopLevel[Use with Double]
  
}

