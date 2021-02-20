package typings.xstate.typesMod

import typings.xstate.typesMod.ActionTypes.Pure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PureAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  
  def get(context: TContext, event: TEvent): js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]] = js.native
  
  @JSName("type")
  var type_PureAction: Pure = js.native
}
object PureAction {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](get: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]], `type`: Pure): PureAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PureAction[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class PureActionMutableBuilder[Self <: PureAction[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (PureAction[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setGet(value: (TContext, TEvent) => js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]): Self = StObject.set(x, "get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setType(value: Pure): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
