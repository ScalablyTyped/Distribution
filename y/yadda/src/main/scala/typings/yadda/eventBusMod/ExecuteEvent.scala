package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_EXECUTE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteEvent extends js.Object {
  
  var data: ExecuteEventData = js.native
  
  var name: __ON_EXECUTE__ = js.native
}
object ExecuteEvent {
  
  @scala.inline
  def apply(data: ExecuteEventData, name: __ON_EXECUTE__): ExecuteEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecuteEvent]
  }
  
  @scala.inline
  implicit class ExecuteEventOps[Self <: ExecuteEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: ExecuteEventData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: __ON_EXECUTE__): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
