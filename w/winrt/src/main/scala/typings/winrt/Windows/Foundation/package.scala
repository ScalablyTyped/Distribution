package typings.winrt.Windows

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Foundation {
  
  type AsyncActionCompletedHandler = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncAction, 
    /* asyncStatus */ typings.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  type AsyncActionProgressHandler[TProgress] = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  type AsyncActionWithProgressCompletedHandler[TProgress] = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncActionWithProgress[TProgress], 
    /* asyncStatus */ typings.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  type AsyncOperationCompletedHandler[TResult] = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncOperation[TResult], 
    /* asyncStatus */ typings.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  type AsyncOperationProgressHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* progressInfo */ TProgress, 
    scala.Unit
  ]
  
  type AsyncOperationWithProgressCompletedHandler[TResult, TProgress] = js.Function2[
    /* asyncInfo */ typings.winrt.Windows.Foundation.IAsyncOperationWithProgress[TResult, TProgress], 
    /* asyncStatus */ typings.winrt.Windows.Foundation.AsyncStatus, 
    scala.Unit
  ]
  
  type EventHandler[T] = js.Function2[/* sender */ js.Any, /* args */ T, scala.Unit]
  
  type TypedEventHandler[TSender, TResult] = js.Function2[/* sender */ TSender, /* args */ TResult, scala.Unit]
}
