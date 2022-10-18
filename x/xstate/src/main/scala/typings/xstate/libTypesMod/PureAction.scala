package typings.xstate.libTypesMod

import typings.xstate.libTypesMod.ActionTypes.Pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PureAction[TContext, TEvent /* <: EventObject */]
  extends StObject
     with ActionObject[TContext, TEvent] {
  
  def get(context: TContext, event: TEvent): js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
  
  @JSName("type")
  var type_PureAction: Pure
}
object PureAction {
  
  inline def apply[TContext, TEvent /* <: EventObject */](get: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]], `type`: Pure): PureAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PureAction[TContext, TEvent]]
  }
  
  extension [Self <: PureAction[?, ?], TContext, TEvent /* <: EventObject */](x: Self & (PureAction[TContext, TEvent])) {
    
    inline def setGet(value: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    inline def setType(value: Pure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
