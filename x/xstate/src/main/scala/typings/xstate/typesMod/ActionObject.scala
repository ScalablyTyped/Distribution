package typings.xstate.typesMod

import org.scalablytyped.runtime.StringDictionary
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
  implicit class ActionObjectOps[Self <: ActionObject[_, _], TContext, TEvent /* <: EventObject */] (val x: Self with (ActionObject[TContext, TEvent])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExec(value: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => Unit): Self = this.set("exec", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteExec: Self = this.set("exec", js.undefined)
  }
}
