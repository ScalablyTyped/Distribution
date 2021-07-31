package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancellationToken extends StObject {
  
  def isCancellationRequested(): Boolean
  
  /** @throws OperationCanceledException if isCancellationRequested is true */
  def throwIfCancellationRequested(): Unit
}
object CancellationToken {
  
  @scala.inline
  def apply(isCancellationRequested: () => Boolean, throwIfCancellationRequested: () => Unit): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), throwIfCancellationRequested = js.Any.fromFunction0(throwIfCancellationRequested))
    __obj.asInstanceOf[CancellationToken]
  }
  
  @scala.inline
  implicit class CancellationTokenMutableBuilder[Self <: CancellationToken] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsCancellationRequested(value: () => Boolean): Self = StObject.set(x, "isCancellationRequested", js.Any.fromFunction0(value))
    
    @scala.inline
    def setThrowIfCancellationRequested(value: () => Unit): Self = StObject.set(x, "throwIfCancellationRequested", js.Any.fromFunction0(value))
  }
}
