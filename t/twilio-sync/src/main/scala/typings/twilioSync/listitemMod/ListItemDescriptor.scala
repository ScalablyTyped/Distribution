package typings.twilioSync.listitemMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListItemDescriptor extends js.Object {
  
  var dateExpires: String = js.native
  
  var dateUpdated: Date = js.native
  
  var index: Double = js.native
  
  var lastEventId: Double = js.native
  
  var revision: String = js.native
  
  var uri: String = js.native
  
  var value: js.Object = js.native
}
object ListItemDescriptor {
  
  @scala.inline
  def apply(
    dateExpires: String,
    dateUpdated: Date,
    index: Double,
    lastEventId: Double,
    revision: String,
    uri: String,
    value: js.Object
  ): ListItemDescriptor = {
    val __obj = js.Dynamic.literal(dateExpires = dateExpires.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListItemDescriptor]
  }
  
  @scala.inline
  implicit class ListItemDescriptorOps[Self <: ListItemDescriptor] (val x: Self) extends AnyVal {
    
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
    def setDateExpires(value: String): Self = this.set("dateExpires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUpdated(value: Date): Self = this.set("dateUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastEventId(value: Double): Self = this.set("lastEventId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevision(value: String): Self = this.set("revision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: String): Self = this.set("uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Object): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
