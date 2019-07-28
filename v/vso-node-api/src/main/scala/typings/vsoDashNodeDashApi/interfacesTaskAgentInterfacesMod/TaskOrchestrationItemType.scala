package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskOrchestrationItemType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationItemType")
@js.native
object TaskOrchestrationItemType extends js.Object {
  @js.native
  sealed trait Container extends TaskOrchestrationItemType
  
  @js.native
  sealed trait Job extends TaskOrchestrationItemType
  
  /* 0 */ val Container: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType.Container with Double = js.native
  /* 1 */ val Job: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType.Job with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationItemType with Double] = js.native
}

