package typings.terminalKit.anon

import typings.terminalKit.terminalMod.GridMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `2` extends StObject {
  
  var promise: js.Promise[GridMenuResponse]
}
object `2` {
  
  inline def apply(promise: js.Promise[GridMenuResponse]): `2` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`2`]
  }
  
  extension [Self <: `2`](x: Self) {
    
    inline def setPromise(value: js.Promise[GridMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
