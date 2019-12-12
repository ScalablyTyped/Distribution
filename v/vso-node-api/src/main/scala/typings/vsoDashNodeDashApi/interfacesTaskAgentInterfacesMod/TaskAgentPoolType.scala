package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolType.Automation
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskAgentPoolType.Deployment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentPoolType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentPoolType")
@js.native
object TaskAgentPoolType extends js.Object {
  @js.native
  sealed trait Automation extends TaskAgentPoolType
  
  @js.native
  sealed trait Deployment extends TaskAgentPoolType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentPoolType with Double] = js.native
  /* 1 */ @js.native
  object Automation extends TopLevel[Automation with Double]
  
  /* 2 */ @js.native
  object Deployment extends TopLevel[Deployment with Double]
  
}

