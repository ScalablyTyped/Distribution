package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentPoolType extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolType with Double] = js.native
  
  @js.native
  sealed trait Automation extends TaskAgentPoolType
  /* 1 */ @js.native
  object Automation extends TopLevel[Automation with Double]
  
  @js.native
  sealed trait Deployment extends TaskAgentPoolType
  /* 2 */ @js.native
  object Deployment extends TopLevel[Deployment with Double]
}
