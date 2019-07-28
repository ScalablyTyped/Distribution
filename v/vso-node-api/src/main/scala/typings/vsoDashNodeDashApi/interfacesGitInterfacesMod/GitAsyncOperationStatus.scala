package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

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
  
  /* 5 */ val Abandoned: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Abandoned with Double = js.native
  /* 3 */ val Completed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Completed with Double = js.native
  /* 4 */ val Failed: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Failed with Double = js.native
  /* 2 */ val InProgress: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.InProgress with Double = js.native
  /* 1 */ val Queued: typings.vsoDashNodeDashApi.interfacesGitInterfacesMod.GitAsyncOperationStatus.Queued with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncOperationStatus with Double] = js.native
}

