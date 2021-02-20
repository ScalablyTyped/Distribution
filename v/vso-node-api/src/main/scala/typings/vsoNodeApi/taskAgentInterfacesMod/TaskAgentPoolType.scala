package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolType with Double] = js.native
  
  @js.native
  sealed trait Automation extends TaskAgentPoolType
  /* 1 */ val Automation: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolType.Automation with Double = js.native
  
  @js.native
  sealed trait Deployment extends TaskAgentPoolType
  /* 2 */ val Deployment: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolType.Deployment with Double = js.native
}
