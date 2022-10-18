package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolActionFilter")
@js.native
object TaskAgentPoolActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolActionFilter & Double] = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with TaskAgentPoolActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.Manage & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TaskAgentPoolActionFilter
  /* 0 */ val None: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.None & Double = js.native
  
  @js.native
  sealed trait Use
    extends StObject
       with TaskAgentPoolActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolActionFilter.Use & Double = js.native
}
