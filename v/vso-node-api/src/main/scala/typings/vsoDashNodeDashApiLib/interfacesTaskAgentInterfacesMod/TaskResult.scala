package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskResult extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskResult")
@js.native
object TaskResult extends js.Object {
  @js.native
  sealed trait Abandoned
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  @js.native
  sealed trait Skipped
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  @js.native
  sealed trait SucceededWithIssues
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult
  
  /* 5 */ val Abandoned: Abandoned with scala.Double = js.native
  /* 3 */ val Canceled: Canceled with scala.Double = js.native
  /* 2 */ val Failed: Failed with scala.Double = js.native
  /* 4 */ val Skipped: Skipped with scala.Double = js.native
  /* 0 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 1 */ val SucceededWithIssues: SucceededWithIssues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TaskResult with scala.Double
  ] = js.native
}

