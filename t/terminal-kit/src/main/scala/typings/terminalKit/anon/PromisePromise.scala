package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleLineMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PromisePromise extends StObject {
  
  var promise: js.Promise[SingleLineMenuResponse]
}
object PromisePromise {
  
  inline def apply(promise: js.Promise[SingleLineMenuResponse]): PromisePromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisePromise]
  }
  
  extension [Self <: PromisePromise](x: Self) {
    
    inline def setPromise(value: js.Promise[SingleLineMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
