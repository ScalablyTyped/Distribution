package typings.xstate.anon

import typings.xstate.xstateStrings.Asterisk
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `4` extends StObject {
  
  var event: Asterisk
}
object `4` {
  
  inline def apply(): `4` = {
    val __obj = js.Dynamic.literal(event = "*")
    __obj.asInstanceOf[`4`]
  }
  
  extension [Self <: `4`](x: Self) {
    
    inline def setEvent(value: Asterisk): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
