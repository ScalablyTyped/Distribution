package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

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
  sealed trait Abandoned
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus
  
  /**
    * The operation has completed.
    */
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus
  
  /**
    * The operation has failed. Check for an error message.
    */
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus
  
  /**
    * The operation is currently in progress.
    */
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus
  
  /**
    * The operation is waiting in a queue and has not yet started.
    */
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus
  
  /* 5 */ val Abandoned: Abandoned with scala.Double = js.native
  /* 3 */ val Completed: Completed with scala.Double = js.native
  /* 4 */ val Failed: Failed with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 1 */ val Queued: Queued with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesGitInterfacesMod.GitAsyncOperationStatus with scala.Double
  ] = js.native
}

