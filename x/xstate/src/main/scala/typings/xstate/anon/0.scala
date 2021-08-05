package typings.xstate.anon

import typings.xstate.xstateStrings._empty
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var event: _empty
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(event = "")
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setEvent(value: _empty): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
