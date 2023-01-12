package typings.xstate.libTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityDefinition[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var id: String
}
object ActivityDefinition {
  
  inline def apply[TContext, TEvent /* <: EventObject */](id: String, `type`: String): ActivityDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivityDefinition[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (ActivityDefinition[TContext, TEvent])) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
