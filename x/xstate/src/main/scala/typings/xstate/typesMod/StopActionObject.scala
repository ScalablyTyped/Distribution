package typings.xstate.typesMod

import typings.xstate.anon.Id
import typings.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopActionObject extends js.Object {
  
  var activity: Id = js.native
  
  var `type`: Stop = js.native
}
object StopActionObject {
  
  @scala.inline
  def apply(activity: Id, `type`: Stop): StopActionObject = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActionObject]
  }
  
  @scala.inline
  implicit class StopActionObjectOps[Self <: StopActionObject] (val x: Self) extends AnyVal {
    
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
    def setActivity(value: Id): Self = this.set("activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: Stop): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
