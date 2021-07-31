package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentQueueActionFilter extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentQueueActionFilter")
@js.native
object TaskAgentQueueActionFilter extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentQueueActionFilter & Double] = js.native
  
  @js.native
  sealed trait Manage
    extends StObject
       with TaskAgentQueueActionFilter
  /* 2 */ val Manage: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.Manage & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with TaskAgentQueueActionFilter
  /* 0 */ val None: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.None & Double = js.native
  
  @js.native
  sealed trait Use
    extends StObject
       with TaskAgentQueueActionFilter
  /* 16 */ val Use: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentQueueActionFilter.Use & Double = js.native
}
