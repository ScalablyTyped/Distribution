package typings.xstate.anon

import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var event: Asterisk
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal(event = "*")
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setEvent(value: Asterisk): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
