package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Choose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChooseAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  var conds: js.Array[ChooseConditon[TContext, TEvent]]
  
  @JSName("type")
  var type_ChooseAction: Choose
}
object ChooseAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */](conds: js.Array[ChooseConditon[TContext, TEvent]], `type`: Choose): ChooseAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(conds = conds.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseAction[TContext, TEvent]]
  }
  
  extension [Self <: ChooseAction[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (ChooseAction[TContext, TEvent])) {
    
    inline def setConds(value: js.Array[ChooseConditon[TContext, TEvent]]): Self = StObject.set(x, "conds", value.asInstanceOf[js.Any])
    
    inline def setCondsVarargs(value: (ChooseConditon[TContext, TEvent])*): Self = StObject.set(x, "conds", js.Array(value :_*))
    
    inline def setType(value: Choose): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
