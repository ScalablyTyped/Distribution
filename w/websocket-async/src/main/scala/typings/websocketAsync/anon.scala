package typings.websocketAsync

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reject extends StObject {
    
    def reject(reason: js.Any): Unit
    
    def resolve(data: js.Any): Unit
  }
  object Reject {
    
    inline def apply(reject: js.Any => Unit, resolve: js.Any => Unit): Reject = {
      val __obj = js.Dynamic.literal(reject = js.Any.fromFunction1(reject), resolve = js.Any.fromFunction1(resolve))
      __obj.asInstanceOf[Reject]
    }
    
    extension [Self <: Reject](x: Self) {
      
      inline def setReject(value: js.Any => Unit): Self = StObject.set(x, "reject", js.Any.fromFunction1(value))
      
      inline def setResolve(value: js.Any => Unit): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
    }
  }
}
