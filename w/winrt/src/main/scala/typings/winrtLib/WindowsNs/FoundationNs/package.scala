package typings
package winrtLib.WindowsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object FoundationNs {
  type AsyncActionCompletedHandler = js.Function2[/* asyncInfo */ IAsyncAction, /* asyncStatus */ AsyncStatus, scala.Unit]
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ AsyncStatus, 
    scala.Unit
  ]
  type AsyncOperationCompletedHandler[TResult] = js.Function2[/* asyncInfo */ IAsyncOperation[TResult], /* asyncStatus */ AsyncStatus, scala.Unit]
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ AsyncStatus, 
    scala.Unit
  ]
  type EventHandler[T] = js.Function2[/* sender */ js.Any, /* args */ T, scala.Unit]
  type TypedEventHandler[TSender, TResult] = js.Function2[/* sender */ TSender, /* args */ TResult, scala.Unit]
}
