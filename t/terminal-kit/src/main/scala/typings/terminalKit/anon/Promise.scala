package typings.terminalKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Promise extends StObject {
  
  def abort(): Unit
  
  var promise: js.Promise[js.UndefOr[String]]
}
object Promise {
  
  inline def apply(abort: () => Unit, promise: js.Promise[js.UndefOr[String]]): Promise = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Promise] (val x: Self) extends AnyVal {
    
    inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
    
    inline def setPromise(value: js.Promise[js.UndefOr[String]]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
