package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncListItemDescriptor extends StObject {
  
  var data: js.Object
  
  var dateExpires: String
  
  var dateUpdated: js.Date
  
  var index: Double
  
  var lastEventId: Double
  
  var revision: String
  
  var uri: String
}
object SyncListItemDescriptor {
  
  inline def apply(
    data: js.Object,
    dateExpires: String,
    dateUpdated: js.Date,
    index: Double,
    lastEventId: Double,
    revision: String,
    uri: String
  ): SyncListItemDescriptor = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dateExpires = dateExpires.asInstanceOf[js.Any], dateUpdated = dateUpdated.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], lastEventId = lastEventId.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncListItemDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncListItemDescriptor] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDateExpires(value: String): Self = StObject.set(x, "dateExpires", value.asInstanceOf[js.Any])
    
    inline def setDateUpdated(value: js.Date): Self = StObject.set(x, "dateUpdated", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLastEventId(value: Double): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: String): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setUri(value: String): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
