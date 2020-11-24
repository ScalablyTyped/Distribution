package typings.tensorflowTfjsLayers.anon

import typings.tensorflowTfjsLayers.baseCallbacksMod.History
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CallbackList extends js.Object {
  
  var callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList = js.native
  
  var history: History = js.native
}
object CallbackList {
  
  @scala.inline
  def apply(callbackList: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList, history: History): CallbackList = {
    val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackList]
  }
  
  @scala.inline
  implicit class CallbackListOps[Self <: CallbackList] (val x: Self) extends AnyVal {
    
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
    def setCallbackList(value: typings.tensorflowTfjsLayers.baseCallbacksMod.CallbackList): Self = this.set("callbackList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistory(value: History): Self = this.set("history", value.asInstanceOf[js.Any])
  }
}
