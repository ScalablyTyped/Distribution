package typings.xstate.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityDefinition[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  var id: String = js.native
}
object ActivityDefinition {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](id: String, `type`: String): ActivityDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityDefinition[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActivityDefinitionMutableBuilder[Self <: ActivityDefinition[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActivityDefinition[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
