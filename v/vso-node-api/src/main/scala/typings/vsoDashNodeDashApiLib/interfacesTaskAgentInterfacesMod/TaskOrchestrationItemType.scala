package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskOrchestrationItemType extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskOrchestrationItemType")
@js.native
object TaskOrchestrationItemType extends js.Object {
  @js.native
  sealed trait Container
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType
  
  @js.native
  sealed trait Job
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType
  
  /* 0 */ val Container: Container with scala.Double = js.native
  /* 1 */ val Job: Job with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskOrchestrationItemType with scala.Double
  ] = js.native
}

