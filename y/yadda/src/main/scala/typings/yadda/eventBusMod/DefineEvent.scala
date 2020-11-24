package typings.yadda.eventBusMod

import typings.yadda.yaddaStrings.__ON_DEFINE__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefineEvent extends js.Object {
  
  var data: DefineEventData = js.native
  
  var name: __ON_DEFINE__ = js.native
}
object DefineEvent {
  
  @scala.inline
  def apply(data: DefineEventData, name: __ON_DEFINE__): DefineEvent = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefineEvent]
  }
  
  @scala.inline
  implicit class DefineEventOps[Self <: DefineEvent] (val x: Self) extends AnyVal {
    
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
    def setData(value: DefineEventData): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: __ON_DEFINE__): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
