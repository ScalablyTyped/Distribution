package typings.winrtDashUwp.WindowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FoundationNs {
  import typings.winrtDashUwp.WindowsNs.WinRTEvent

  /** Represents a method that handles the completed event of an asynchronous action. */
  type AsyncActionCompletedHandler = js.Function2[/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus, Unit]
  /** Represents a method that handles progress update events of an asynchronous action that provides progress updates. */
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous action that provides progress updates. */
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ AsyncStatus, 
    Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous operation. */
  type AsyncOperationCompletedHandler[TResult] = js.Function2[/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus, Unit]
  /** Represents a method that handles progress update events of an asynchronous operation that provides progress updates. */
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    Unit
  ]
  /** Represents a method that handles the completed event of an asynchronous operation that provides progress updates. */
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ AsyncStatus, 
    Unit
  ]
  /** Represents a method that handles the completed event of a deferred action. */
  type DeferralCompletedHandler = js.Function0[Unit]
  /** Represents a method that handles general events. */
  type EventHandler[T] = js.Function1[/* ev */ T with WinRTEvent[_], Unit]
  type IPromiseWithIAsyncAction = IPromiseWithOperation[Unit, IAsyncAction]
  type IPromiseWithIAsyncActionWithProgress[TProgress] = IPromiseWithOperation[Unit, IAsyncActionWithProgress[TProgress]]
  type IPromiseWithIAsyncOperation[TResult] = IPromiseWithOperation[TResult, IAsyncOperation[TResult]]
  type IPromiseWithIAsyncOperationWithProgress[TResult, TProgress] = IPromiseWithOperation[TResult, IAsyncOperationWithProgress[TResult, TProgress]]
  /** Represents a method that handles general events. */
  type TypedEventHandler[TSender, TResult] = js.Function1[/* ev */ TResult with WinRTEvent[TSender], Unit]
}
