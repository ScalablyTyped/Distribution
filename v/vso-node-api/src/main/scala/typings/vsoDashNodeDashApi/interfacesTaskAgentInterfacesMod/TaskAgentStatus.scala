package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskAgentStatus extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskAgentStatus")
@js.native
object TaskAgentStatus extends js.Object {
  @js.native
  sealed trait Offline extends TaskAgentStatus
  
  @js.native
  sealed trait Online extends TaskAgentStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskAgentStatus with Double] = js.native
  /* 1 */ @js.native
  object Offline extends TopLevel[Offline with Double]
  
  /* 2 */ @js.native
  object Online extends TopLevel[Online with Double]
  
}

