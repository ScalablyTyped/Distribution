package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionObject[TContext, TEvent /* <: EventObject */]
  extends /* option */ StringDictionary[js.Any] {
  
  /**
    * The implementation for executing the action.
    */
  var exec: js.UndefOr[ActionFunction[TContext, TEvent]] = js.native
  
  /**
    * The type of action that is executed.
    */
  var `type`: String = js.native
}
object ActionObject {
  
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](`type`: String): ActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[TContext, TEvent]]
  }
  
  @scala.inline
  implicit class ActionObjectMutableBuilder[Self <: ActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def setExec(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = StObject.set(x, "exec", js.Any.fromFunction3(value))
    
    @scala.inline
    def setExecUndefined: Self = StObject.set(x, "exec", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
