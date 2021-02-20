package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncOperationStatus")
@js.native
object GitAsyncOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncOperationStatus with Double] = js.native
  
  /**
    * The operation has been abandoned.
    */
  @js.native
  sealed trait Abandoned extends GitAsyncOperationStatus
  /* 5 */ val Abandoned: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Abandoned with Double = js.native
  
  /**
    * The operation has completed.
    */
  @js.native
  sealed trait Completed extends GitAsyncOperationStatus
  /* 3 */ val Completed: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Completed with Double = js.native
  
  /**
    * The operation has failed. Check for an error message.
    */
  @js.native
  sealed trait Failed extends GitAsyncOperationStatus
  /* 4 */ val Failed: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Failed with Double = js.native
  
  /**
    * The operation is currently in progress.
    */
  @js.native
  sealed trait InProgress extends GitAsyncOperationStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.InProgress with Double = js.native
  
  /**
    * The operation is waiting in a queue and has not yet started.
    */
  @js.native
  sealed trait Queued extends GitAsyncOperationStatus
  /* 1 */ val Queued: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Queued with Double = js.native
}
