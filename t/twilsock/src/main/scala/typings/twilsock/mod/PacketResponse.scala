package typings.twilsock.mod

import typings.std.Record
import typings.twilsock.anon.Capabilities
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PacketResponse extends StObject {
  
  var body: Context[Record[String, Any]]
  
  var header: Capabilities
  
  var id: String
}
object PacketResponse {
  
  inline def apply(body: Context[Record[String, Any]], header: Capabilities, id: String): PacketResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[PacketResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PacketResponse] (val x: Self) extends AnyVal {
    
    inline def setBody(value: Context[Record[String, Any]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeader(value: Capabilities): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
