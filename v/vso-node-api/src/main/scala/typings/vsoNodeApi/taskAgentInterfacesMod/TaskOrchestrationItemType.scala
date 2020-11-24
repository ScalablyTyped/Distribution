package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskOrchestrationItemType extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationItemType")
@js.native
object TaskOrchestrationItemType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskOrchestrationItemType with Double] = js.native
  
  @js.native
  sealed trait Container extends TaskOrchestrationItemType
  /* 0 */ @js.native
  object Container extends TopLevel[Container with Double]
  
  @js.native
  sealed trait Job extends TaskOrchestrationItemType
  /* 1 */ @js.native
  object Job extends TopLevel[Job with Double]
}
