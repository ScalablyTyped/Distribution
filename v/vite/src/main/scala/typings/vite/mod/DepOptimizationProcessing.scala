package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOptimizationProcessing extends StObject {
  
  var promise: js.Promise[Unit]
  
  def resolve(): Unit
}
object DepOptimizationProcessing {
  
  inline def apply(promise: js.Promise[Unit], resolve: () => Unit): DepOptimizationProcessing = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], resolve = js.Any.fromFunction0(resolve))
    __obj.asInstanceOf[DepOptimizationProcessing]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepOptimizationProcessing] (val x: Self) extends AnyVal {
    
    inline def setPromise(value: js.Promise[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
    
    inline def setResolve(value: () => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction0(value))
  }
}
