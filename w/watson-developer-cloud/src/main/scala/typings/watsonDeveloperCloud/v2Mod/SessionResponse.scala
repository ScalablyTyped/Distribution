package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** SessionResponse. */
trait SessionResponse extends StObject {
  
  /** The session ID. */
  var session_id: String
}
object SessionResponse {
  
  @scala.inline
  def apply(session_id: String): SessionResponse = {
    val __obj = js.Dynamic.literal(session_id = session_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionResponse]
  }
  
  @scala.inline
  implicit class SessionResponseMutableBuilder[Self <: SessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
  }
}
