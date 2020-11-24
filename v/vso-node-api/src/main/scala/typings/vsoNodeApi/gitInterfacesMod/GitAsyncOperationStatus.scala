package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait GitAsyncOperationStatus extends js.Object
@JSImport("vso-node-api/interfaces/GitInterfaces", "GitAsyncOperationStatus")
@js.native
object GitAsyncOperationStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GitAsyncOperationStatus with Double] = js.native
  
  /**
    * The operation has been abandoned.
    */
  @js.native
  sealed trait Abandoned extends GitAsyncOperationStatus
  /* 5 */ @js.native
  object Abandoned extends TopLevel[Abandoned with Double]
  
  /**
    * The operation has completed.
    */
  @js.native
  sealed trait Completed extends GitAsyncOperationStatus
  /* 3 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /**
    * The operation has failed. Check for an error message.
    */
  @js.native
  sealed trait Failed extends GitAsyncOperationStatus
  /* 4 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The operation is currently in progress.
    */
  @js.native
  sealed trait InProgress extends GitAsyncOperationStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * The operation is waiting in a queue and has not yet started.
    */
  @js.native
  sealed trait Queued extends GitAsyncOperationStatus
  /* 1 */ @js.native
  object Queued extends TopLevel[Queued with Double]
}
