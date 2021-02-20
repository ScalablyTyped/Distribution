package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentQueueActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentQueueActionFilter")
@js.native
object TaskAgentQueueActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentQueueActionFilter with Double] = js.native
  
  @js.native
  sealed trait Manage extends TaskAgentQueueActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.Manage with Double = js.native
  
  @js.native
  sealed trait None extends TaskAgentQueueActionFilter
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.None with Double = js.native
  
  @js.native
  sealed trait Use extends TaskAgentQueueActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.Use with Double = js.native
}
