package typings.twilsock.mod.Messages

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractMessage extends StObject {
  
  val id: String
}
object AbstractMessage {
  
  inline def apply(id: String): AbstractMessage = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbstractMessage]
  }
  
  extension [Self <: AbstractMessage](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
