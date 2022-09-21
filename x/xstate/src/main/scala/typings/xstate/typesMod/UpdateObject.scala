package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateObject
  extends StObject
     with EventObject {
  
  var id: String | Double
  
  var state: AnyState
}
object UpdateObject {
  
  inline def apply(id: String | Double, state: AnyState, `type`: String): UpdateObject = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateObject]
  }
  
  extension [Self <: UpdateObject](x: Self) {
    
    inline def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setState(value: AnyState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
