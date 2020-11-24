package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Return value for eventHandlers values
  */
@js.native
trait EventCallbackInterface[TTarget, TEventKey] extends js.Object {
  
  /**
    * Use only in:
    * - VictoryChart
    * - VictoryStack
    */
  var childName: js.UndefOr[String] = js.native
  
  var eventKey: js.UndefOr[TEventKey] = js.native
  
  /**
    * Will be called with the calculated props for the individual selected element and result will override
    * props of selected element via object assignment
    * @param props
    */
  def mutation(props: js.Any): js.Any = js.native
  
  var target: js.UndefOr[TTarget] = js.native
}
object EventCallbackInterface {
  
  @scala.inline
  def apply[TTarget, TEventKey](mutation: js.Any => js.Any): EventCallbackInterface[TTarget, TEventKey] = {
    val __obj = js.Dynamic.literal(mutation = js.Any.fromFunction1(mutation))
    __obj.asInstanceOf[EventCallbackInterface[TTarget, TEventKey]]
  }
  
  @scala.inline
  implicit class EventCallbackInterfaceOps[Self <: EventCallbackInterface[_, _], TTarget, TEventKey] (val x: Self with (EventCallbackInterface[TTarget, TEventKey])) extends AnyVal {
    
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
    def setMutation(value: js.Any => js.Any): Self = this.set("mutation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildName(value: String): Self = this.set("childName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildName: Self = this.set("childName", js.undefined)
    
    @scala.inline
    def setEventKey(value: TEventKey): Self = this.set("eventKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventKey: Self = this.set("eventKey", js.undefined)
    
    @scala.inline
    def setTarget(value: TTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
  }
}
