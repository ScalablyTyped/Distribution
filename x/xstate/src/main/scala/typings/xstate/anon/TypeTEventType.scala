package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeTEventType[TEventType /* <: String */] extends StObject {
  
  var `type`: TEventType
}
object TypeTEventType {
  
  inline def apply[TEventType /* <: String */](`type`: TEventType): TypeTEventType[TEventType] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeTEventType[TEventType]]
  }
  
  extension [Self <: TypeTEventType[?], TEventType /* <: String */](x: Self & TypeTEventType[TEventType]) {
    
    inline def setType(value: TEventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
