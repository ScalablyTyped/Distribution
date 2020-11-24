package typings.vsoNodeApi.taskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskAgentStatus extends js.Object
@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentStatus with Double] = js.native
  
  @js.native
  sealed trait Offline extends TaskAgentStatus
  /* 1 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  @js.native
  sealed trait Online extends TaskAgentStatus
  /* 2 */ @js.native
  object Online extends TopLevel[Online with Double]
}
