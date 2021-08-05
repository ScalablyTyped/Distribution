package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Start
import typings.xstate.typesMod.ActionTypes.Stop
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityActionObject[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var activity: js.UndefOr[ActivityDefinition[TContext, TEvent]] = js.undefined
  
  @JSName("type")
  var type_ActivityActionObject: Start | Stop
}
object ActivityActionObject {
  
  inline def apply[TContext, TEvent /* <: EventObject */](`type`: Start | Stop): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
  
  extension [Self <: ActivityActionObject[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ActivityActionObject[TContext, TEvent])) {
    
    inline def setActivity(value: ActivityDefinition[TContext, TEvent]): Self = StObject.set(x, "activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "activity", js.undefined)
    
    inline def setType(value: Start | Stop): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
