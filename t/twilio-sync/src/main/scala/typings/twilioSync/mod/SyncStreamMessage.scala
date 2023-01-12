package typings.twilioSync.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stream message descriptor.
  */
trait SyncStreamMessage extends StObject {
  
  /**
    * Stream message data.
    */
  var data: js.Object
  
  /**
    * Stream message SID.
    */
  var sid: String
}
object SyncStreamMessage {
  
  inline def apply(data: js.Object, sid: String): SyncStreamMessage = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], sid = sid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncStreamMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncStreamMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setSid(value: String): Self = StObject.set(x, "sid", value.asInstanceOf[js.Any])
  }
}
