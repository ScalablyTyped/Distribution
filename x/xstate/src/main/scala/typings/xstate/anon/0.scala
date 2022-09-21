package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0`[TEventType /* <: String */] extends StObject {
  
  var `type`: TEventType
}
object `0` {
  
  inline def apply[TEventType /* <: String */](`type`: TEventType): `0`[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`0`[TEventType]]
  }
  
  extension [Self <: `0`[?], TEventType /* <: String */](x: Self & `0`[TEventType]) {
    
    inline def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
