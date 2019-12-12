package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Abandoned
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Completed
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Failed
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.InProgress
import typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Queued
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GitAsyncOperationStatus extends js.Object

@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncOperationStatus")
@js.native
object GitAsyncOperationStatus extends js.Object {
  /**
    * The operation has been abandoned.
    */
  @js.native
  sealed trait Abandoned extends GitAsyncOperationStatus
  
  /**
    * The operation has completed.
    */
  @js.native
  sealed trait Completed extends GitAsyncOperationStatus
  
  /**
    * The operation has failed. Check for an error message.
    */
  @js.native
  sealed trait Failed extends GitAsyncOperationStatus
  
  /**
    * The operation is currently in progress.
    */
  @js.native
  sealed trait InProgress extends GitAsyncOperationStatus
  
  /**
    * The operation is waiting in a queue and has not yet started.
    */
  @js.native
  sealed trait Queued extends GitAsyncOperationStatus
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncOperationStatus with Double] = js.native
  /* 5 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 4 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
  
}

