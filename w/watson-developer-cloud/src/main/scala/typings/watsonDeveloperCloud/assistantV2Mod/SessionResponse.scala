package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SessionResponse. */
trait SessionResponse extends StObject {
  
  /** The session ID. */
  var session_id: String
}
object SessionResponse {
  
  inline def apply(session_id: String): SessionResponse = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionResponse]
  }
  
  extension [Self <: SessionResponse](x: Self) {
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
