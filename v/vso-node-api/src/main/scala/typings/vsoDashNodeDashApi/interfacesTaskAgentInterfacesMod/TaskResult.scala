package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Abandoned
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Canceled
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Failed
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Skipped
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.Succeeded
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TaskResult.SucceededWithIssues
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskResult with Double] = js.native
  /* 5 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /* 3 */ @js.native
  object Canceled extends TopLevel[Canceled with Double]
  
  /* 2 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 4 */ @js.native
  object Skipped extends TopLevel[Skipped with Double]
  
  /* 0 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /* 1 */ @js.native
  object SucceededWithIssues extends TopLevel[SucceededWithIssues with Double]
  
}

