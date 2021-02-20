package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentStatus extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentStatus with Double] = js.native
  
  @js.native
  sealed trait Offline extends TaskAgentStatus
  /* 1 */ val Offline: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentStatus.Offline with Double = js.native
  
  @js.native
  sealed trait Online extends TaskAgentStatus
  /* 2 */ val Online: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentStatus.Online with Double = js.native
}
