package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationItemType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationItemType")
@js.native
object TaskOrchestrationItemType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationItemType with Double] = js.native
  
  @js.native
  sealed trait Container extends TaskOrchestrationItemType
  /* 0 */ val Container: typings.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationItemType.Container with Double = js.native
  
  @js.native
  sealed trait Job extends TaskOrchestrationItemType
  /* 1 */ val Job: typings.vsoNodeApi.taskAgentInterfacesMod.TaskOrchestrationItemType.Job with Double = js.native
}
