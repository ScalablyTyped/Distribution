package typings.xstate.anon

import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `3` extends StObject {
  
  var event: Asterisk
}
object `3` {
  
  inline def apply(): `3` = {
    val __obj = js.Dynamic.literal(event = "*")
    __obj.asInstanceOf[`3`]
  }
  
  extension [Self <: `3`](x: Self) {
    
    inline def setEvent(value: Asterisk): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
