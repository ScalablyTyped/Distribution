package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskResult extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TaskResult")
@js.native
object TaskResult extends js.Object {
  @js.native
  sealed trait Abandoned extends TaskResult
  
  @js.native
  sealed trait Canceled extends TaskResult
  
  @js.native
  sealed trait Failed extends TaskResult
  
  @js.native
  sealed trait Skipped extends TaskResult
  
  @js.native
  sealed trait Succeeded extends TaskResult
  
  @js.native
  sealed trait SucceededWithIssues extends TaskResult
  
  /* 5 */ val Abandoned: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Abandoned with Double = js.native
  /* 3 */ val Canceled: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Canceled with Double = js.native
  /* 2 */ val Failed: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Failed with Double = js.native
  /* 4 */ val Skipped: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Skipped with Double = js.native
  /* 0 */ val Succeeded: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Succeeded with Double = js.native
  /* 1 */ val SucceededWithIssues: typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.SucceededWithIssues with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult with Double] = js.native
}

