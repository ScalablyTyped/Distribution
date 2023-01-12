package typings.webpack.mod

import typings.webpack.anon.Added
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AsyncQueue[T, K, R] extends StObject {
  
  def add(item: T, callback: CallbackAsyncQueue[R]): Unit
  
  def clear(): Unit
  
  def decreaseParallelism(): Unit
  
  var hooks: Added[T, R]
  
  def increaseParallelism(): Unit
  
  def invalidate(item: T): Unit
  
  def isDone(item: T): Boolean
  
  def isProcessing(item: T): Boolean
  
  def isQueued(item: T): Boolean
  
  def stop(): Unit
  
  /**
  	 * Waits for an already started item
  	 */
  def waitFor(item: T, callback: CallbackAsyncQueue[R]): Unit
}
object AsyncQueue {
  
  inline def apply[T, K, R](
    add: (T, CallbackAsyncQueue[R]) => Unit,
    clear: () => Unit,
    decreaseParallelism: () => Unit,
    hooks: Added[T, R],
    increaseParallelism: () => Unit,
    invalidate: T => Unit,
    isDone: T => Boolean,
    isProcessing: T => Boolean,
    isQueued: T => Boolean,
    stop: () => Unit,
    waitFor: (T, CallbackAsyncQueue[R]) => Unit
  ): AsyncQueue[T, K, R] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), decreaseParallelism = js.Any.fromFunction0(decreaseParallelism), hooks = hooks.asInstanceOf[js.Any], increaseParallelism = js.Any.fromFunction0(increaseParallelism), invalidate = js.Any.fromFunction1(invalidate), isDone = js.Any.fromFunction1(isDone), isProcessing = js.Any.fromFunction1(isProcessing), isQueued = js.Any.fromFunction1(isQueued), stop = js.Any.fromFunction0(stop), waitFor = js.Any.fromFunction2(waitFor))
    __obj.asInstanceOf[AsyncQueue[T, K, R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AsyncQueue[?, ?, ?], T, K, R] (val x: Self & (AsyncQueue[T, K, R])) extends AnyVal {
    
    inline def setAdd(value: (T, CallbackAsyncQueue[R]) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setDecreaseParallelism(value: () => Unit): Self = StObject.set(x, "decreaseParallelism", js.Any.fromFunction0(value))
    
    inline def setHooks(value: Added[T, R]): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    inline def setIncreaseParallelism(value: () => Unit): Self = StObject.set(x, "increaseParallelism", js.Any.fromFunction0(value))
    
    inline def setInvalidate(value: T => Unit): Self = StObject.set(x, "invalidate", js.Any.fromFunction1(value))
    
    inline def setIsDone(value: T => Boolean): Self = StObject.set(x, "isDone", js.Any.fromFunction1(value))
    
    inline def setIsProcessing(value: T => Boolean): Self = StObject.set(x, "isProcessing", js.Any.fromFunction1(value))
    
    inline def setIsQueued(value: T => Boolean): Self = StObject.set(x, "isQueued", js.Any.fromFunction1(value))
    
    inline def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    
    inline def setWaitFor(value: (T, CallbackAsyncQueue[R]) => Unit): Self = StObject.set(x, "waitFor", js.Any.fromFunction2(value))
  }
}
