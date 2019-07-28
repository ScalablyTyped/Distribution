package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

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
  
  /* 2 */ val Manage: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.Manage with Double = js.native
  /* 0 */ val None: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.None with Double = js.native
  /* 16 */ val Use: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.Use with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MachineGroupActionFilter with Double] = js.native
}

