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
  
  inline def apply(isCancellationRequested: () => Boolean, throwIfCancellationRequested: () => Unit): CancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested), throwIfCancellationRequested = js.Any.fromFunction0(throwIfCancellationRequested))
    __obj.asInstanceOf[CancellationToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CancellationToken] (val x: Self) extends AnyVal {
    
    inline def setIsCancellationRequested(value: () => Boolean): Self = StObject.set(x, "isCancellationRequested", js.Any.fromFunction0(value))
    
    inline def setThrowIfCancellationRequested(value: () => Unit): Self = StObject.set(x, "throwIfCancellationRequested", js.Any.fromFunction0(value))
  }
}
