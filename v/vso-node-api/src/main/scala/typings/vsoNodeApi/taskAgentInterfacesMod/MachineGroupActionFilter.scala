package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MachineGroupActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MachineGroupActionFilter")
@js.native
object MachineGroupActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MachineGroupActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends MachineGroupActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.taskAgentInterfacesMod.MachineGroupActionFilter.Manage with Double = js.native
  
  @js.native
  sealed trait None extends MachineGroupActionFilter
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.MachineGroupActionFilter.None with Double = js.native
  
  @js.native
  sealed trait Use extends MachineGroupActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.taskAgentInterfacesMod.MachineGroupActionFilter.Use with Double = js.native
}
