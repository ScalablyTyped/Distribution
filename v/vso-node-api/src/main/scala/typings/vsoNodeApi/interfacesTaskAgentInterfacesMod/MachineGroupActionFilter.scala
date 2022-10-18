package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MachineGroupActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "MachineGroupActionFilter")
@js.native
object MachineGroupActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MachineGroupActionFilter & Double] = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with MachineGroupActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.Manage & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with MachineGroupActionFilter
  /* 0 */ val None: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.None & Double = js.native
  
  @js.native
  sealed trait Use
    extends StObject
       with MachineGroupActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.MachineGroupActionFilter.Use & Double = js.native
}
