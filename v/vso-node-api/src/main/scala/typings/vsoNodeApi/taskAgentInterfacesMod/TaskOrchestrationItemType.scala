package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationItemType with Double] = js.native
  /* 0 */ @js.native
  object Container extends TopLevel[Container with Double]
  
  /* 1 */ @js.native
  object Job extends TopLevel[Job with Double]
  
}

