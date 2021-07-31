package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolType extends StObject
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolType & Double] = js.native
  
  @js.native
  sealed trait Automation
    extends StObject
       with TaskAgentPoolType
  /* 1 */ val Automation: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolType.Automation & Double = js.native
  
  @js.native
  sealed trait Deployment
    extends StObject
       with TaskAgentPoolType
  /* 2 */ val Deployment: typings.vsoNodeApi.taskAgentInterfacesMod.TaskAgentPoolType.Deployment & Double = js.native
}
