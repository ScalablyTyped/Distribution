package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostCancellationToken extends StObject {
  
  def isCancellationRequested(): Boolean
}
object HostCancellationToken {
  
  inline def apply(isCancellationRequested: () => Boolean): HostCancellationToken = {
    val __obj = js.Dynamic.literal(isCancellationRequested = js.Any.fromFunction0(isCancellationRequested))
    __obj.asInstanceOf[HostCancellationToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostCancellationToken] (val x: Self) extends AnyVal {
    
    inline def setIsCancellationRequested(value: () => Boolean): Self = StObject.set(x, "isCancellationRequested", js.Any.fromFunction0(value))
  }
}
