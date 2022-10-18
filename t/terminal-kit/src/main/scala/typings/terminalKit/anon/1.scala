package typings.terminalKit.anon

import typings.terminalKit.terminalMod.SingleColumnMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var promise: js.Promise[SingleColumnMenuResponse]
}
object `1` {
  
  inline def apply(promise: js.Promise[SingleColumnMenuResponse]): `1` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setPromise(value: js.Promise[SingleColumnMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
