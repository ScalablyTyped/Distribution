package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncOperationStatus extends StObject
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncOperationStatus")
@js.native
object GitAsyncOperationStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncOperationStatus & Double] = js.native
  
  /**
    * The operation has been abandoned.
    */
  @js.native
  sealed trait Abandoned
    extends StObject
       with GitAsyncOperationStatus
  /* 5 */ val Abandoned: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Abandoned & Double = js.native
  
  /**
    * The operation has completed.
    */
  @js.native
  sealed trait Completed
    extends StObject
       with GitAsyncOperationStatus
  /* 3 */ val Completed: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Completed & Double = js.native
  
  /**
    * The operation has failed. Check for an error message.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with GitAsyncOperationStatus
  /* 4 */ val Failed: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Failed & Double = js.native
  
  /**
    * The operation is currently in progress.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with GitAsyncOperationStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.InProgress & Double = js.native
  
  /**
    * The operation is waiting in a queue and has not yet started.
    */
  @js.native
  sealed trait Queued
    extends StObject
       with GitAsyncOperationStatus
  /* 1 */ val Queued: typings.vsoNodeApi.gitInterfacesMod.GitAsyncOperationStatus.Queued & Double = js.native
}
