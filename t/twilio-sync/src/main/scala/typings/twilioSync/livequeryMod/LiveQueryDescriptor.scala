package typings.twilioSync.livequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LiveQueryDescriptor extends js.Object {
  
  var indexName: String = js.native
  
  var last_event_id: Double = js.native
  
  var queryExpression: String = js.native
  
  var queryUri: String = js.native
  
  var sid: String = js.native
}
object LiveQueryDescriptor {
  
  @scala.inline
  def apply(indexName: String, last_event_id: Double, queryExpression: String, queryUri: String, sid: String): LiveQueryDescriptor = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], last_event_id = last_event_id.asInstanceOf[js.Any], queryExpression = queryExpression.asInstanceOf[js.Any], queryUri = queryUri.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiveQueryDescriptor]
  }
  
  @scala.inline
  implicit class LiveQueryDescriptorOps[Self <: LiveQueryDescriptor] (val x: Self) extends AnyVal {
    
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
    def setIndexName(value: String): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_event_id(value: Double): Self = this.set("last_event_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryExpression(value: String): Self = this.set("queryExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUri(value: String): Self = this.set("queryUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSid(value: String): Self = this.set("sid", value.asInstanceOf[js.Any])
  }
}
