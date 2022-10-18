package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NullEvent extends StObject {
  
  var `type`: typings.xstate.libTypesMod.ActionTypes.NullEvent
}
object NullEvent {
  
  inline def apply(`type`: typings.xstate.libTypesMod.ActionTypes.NullEvent): NullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEvent]
  }
  
  extension [Self <: NullEvent](x: Self) {
    
    inline def setType(value: typings.xstate.libTypesMod.ActionTypes.NullEvent): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
