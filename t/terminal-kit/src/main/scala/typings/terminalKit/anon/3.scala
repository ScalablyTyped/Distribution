package typings.terminalKit.anon

import typings.terminalKit.terminalMod.GridMenuResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var promise: js.Promise[GridMenuResponse]
}
object `3` {
  
  inline def apply(promise: js.Promise[GridMenuResponse]): `3` = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any])
    __obj.asInstanceOf[`3`]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
    
    inline def setPromise(value: js.Promise[GridMenuResponse]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
  }
}
