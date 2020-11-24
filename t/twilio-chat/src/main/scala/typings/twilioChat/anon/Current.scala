package typings.twilioChat.anon

import typings.std.Date
import typings.twilioChat.twilioChatStrings.active
import typings.twilioChat.twilioChatStrings.closed
import typings.twilioChat.twilioChatStrings.inactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Current extends js.Object {
  
  var current: active | inactive | closed = js.native
  
  var dateUpdated: Date = js.native
}
object Current {
  
  @scala.inline
  def apply(current: active | inactive | closed, dateUpdated: Date): Current = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any])
    __obj.asInstanceOf[Current]
  }
  
  @scala.inline
  implicit class CurrentOps[Self <: Current] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: active | inactive | closed): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdated(value: Date): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
  }
}
