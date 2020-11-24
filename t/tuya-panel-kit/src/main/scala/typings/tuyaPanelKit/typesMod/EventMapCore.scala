package typings.tuyaPanelKit.typesMod

import typings.tuyaPanelKit.anon.CanPreventDefaultData
import typings.tuyaPanelKit.anon.Data
import typings.tuyaPanelKit.anon.DataStateState
import typings.tuyaPanelKit.routersTypesMod.NavigationState
import typings.tuyaPanelKit.routersTypesMod.ParamListBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventMapCore[State /* <: NavigationState[ParamListBase] */] extends js.Object {
  
  var beforeRemove: CanPreventDefaultData = js.native
  
  var blur: Data = js.native
  
  var focus: Data = js.native
  
  var state: DataStateState[State] = js.native
}
object EventMapCore {
  
  @scala.inline
  def apply[State /* <: NavigationState[ParamListBase] */](beforeRemove: CanPreventDefaultData, blur: Data, focus: Data, state: DataStateState[State]): EventMapCore[State] = {
    val __obj = js.Dynamic.literal(beforeRemove = beforeRemove.asInstanceOf[js.Any], blur = blur.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventMapCore[State]]
  }
  
  @scala.inline
  implicit class EventMapCoreOps[Self <: EventMapCore[_], State /* <: NavigationState[ParamListBase] */] (val x: Self with EventMapCore[State]) extends AnyVal {
    
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
    def setBeforeRemove(value: CanPreventDefaultData): Self = this.set("beforeRemove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlur(value: Data): Self = this.set("blur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocus(value: Data): Self = this.set("focus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: DataStateState[State]): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
