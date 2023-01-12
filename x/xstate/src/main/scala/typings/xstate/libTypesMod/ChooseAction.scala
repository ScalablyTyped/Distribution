package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Choose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent]
     with _BaseAction[TContext, TEvent, Any] {
  
  var conds: js.Array[ChooseCondition[TContext, TEvent]]
  
  @JSName("type")
  var type_ChooseAction: Choose
}
object ChooseAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseCondition[TContext, TEvent]], `type`: Choose): ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChooseAction[?, ?], TContext, TEvent /* <: EventObject */] (val x: Self & (ChooseAction[TContext, TEvent])) extends AnyVal {
    
    inline def setConds(value: js.Array[ChooseCondition[TContext, TEvent]]): Self = StObject.set(x, "conds", value.asInstanceOf[js.Any])
    
    inline def setCondsVarargs(value: (ChooseCondition[TContext, TEvent])*): Self = StObject.set(x, "conds", js.Array(value*))
    
    inline def setType(value: Choose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
