package typings.watsonDeveloperCloud.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Log message details. */
trait LogMessage
  extends StObject
     with /** DialogNodeOutput accepts additional properties. */
/* propName */ StringDictionary[js.Any] {
  
  /** The severity of the log message. */
  var level: String
  
  /** The text of the log message. */
  var msg: String
}
object LogMessage {
  
  @scala.inline
  def apply(level: String, msg: String): LogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessage]
  }
  
  @scala.inline
  implicit class LogMessageMutableBuilder[Self <: LogMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
