package typings.vsoNodeApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationItemType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationItemType")
@js.native
object TaskOrchestrationItemType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationItemType & Double] = js.native
  
  @js.native
  sealed trait Container
    extends StObject
       with TaskOrchestrationItemType
  /* 0 */ val Container: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType.Container & Double = js.native
  
  @js.native
  sealed trait Job
    extends StObject
       with TaskOrchestrationItemType
  /* 1 */ val Job: typings.vsoNodeApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType.Job & Double = js.native
}
