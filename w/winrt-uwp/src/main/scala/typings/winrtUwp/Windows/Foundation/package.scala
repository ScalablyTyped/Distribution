package typings.winrtUwp.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Foundation {
  
  /** Represents a method that handles the completed event of an asynchronous action. */
  type AsyncActionCompletedHandler = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncAction, 
    /* asyncStatus */ typings.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles progress update events of an asynchronous action that provides progress updates. */
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous action that provides progress updates. */
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ typings.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous operation. */
  type AsyncOperationCompletedHandler[TResult] = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncOperation[TResult], 
    /* asyncStatus */ typings.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles progress update events of an asynchronous operation that provides progress updates. */
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of an asynchronous operation that provides progress updates. */
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ typings.winrtUwp.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  /** Represents a method that handles the completed event of a deferred action. */
  type DeferralCompletedHandler = js.Function0[scala.Unit]
  
  /** Represents a method that handles general events. */
  type EventHandler[T] = js.Function1[/* ev */ T with typings.winrtUwp.Windows.WinRTEvent[_], scala.Unit]
  
  type IPromiseWithIAsyncAction = typings.winrtUwp.Windows.Foundation.IPromiseWithOperation[scala.Unit, typings.winrtUwp.Windows.Foundation.IAsyncAction]
  
  type IPromiseWithIAsyncActionWithProgress[TProgress] = typings.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    scala.Unit, 
    typings.winrtUwp.Windows.Foundation.IAsyncActionWithProgress[TProgress]
  ]
  
  type IPromiseWithIAsyncOperation[TResult] = typings.winrtUwp.Windows.Foundation.IPromiseWithOperation[TResult, typings.winrtUwp.Windows.Foundation.IAsyncOperation[TResult]]
  
  type IPromiseWithIAsyncOperationWithProgress[TResult, TProgress] = typings.winrtUwp.Windows.Foundation.IPromiseWithOperation[
    TResult, 
    typings.winrtUwp.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress]
  ]
  
  /** Represents a method that handles general events. */
  type TypedEventHandler[TSender, TResult] = js.Function1[/* ev */ TResult with typings.winrtUwp.Windows.WinRTEvent[TSender], scala.Unit]
}
