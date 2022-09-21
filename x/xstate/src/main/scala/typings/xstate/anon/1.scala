package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1`[TEventType] extends StObject {
  
  var `type`: TEventType
}
object `1` {
  
  inline def apply[TEventType](`type`: TEventType): `1`[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[TEventType]]
  }
  
  extension [Self <: `1`[?], TEventType](x: Self & `1`[TEventType]) {
    
    inline def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
