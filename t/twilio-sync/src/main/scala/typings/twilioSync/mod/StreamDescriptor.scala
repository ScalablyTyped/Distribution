package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Response body to `POST /v3/Streams` and `GET /v3/Streams/TOxx`
trait StreamDescriptor extends StObject {
  
  var date_expires: String
  
  var links: StreamLinks
  
  var sid: String
  
  var unique_name: String
  
  var url: String
}
object StreamDescriptor {
  
  inline def apply(date_expires: String, links: StreamLinks, sid: String, unique_name: String, url: String): StreamDescriptor = {
    val __obj = js.Dynamic.literal(date_expires = date_expires.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any], unique_name = unique_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamDescriptor] (val x: Self) extends AnyVal {
    
    inline def setDate_expires(value: String): Self = StObject.set(x, "date_expires", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: StreamLinks): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
    
    inline def setUnique_name(value: String): Self = StObject.set(x, "unique_name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
