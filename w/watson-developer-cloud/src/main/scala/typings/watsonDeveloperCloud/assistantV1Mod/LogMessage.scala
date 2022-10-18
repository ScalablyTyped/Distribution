package typings.watsonDeveloperCloud.assistantV1Mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Log message details. */
trait LogMessage
  extends StObject
     with /** QueryNoticesResult accepts additional properties. */
/* propName */ StringDictionary[Any] {
  
  /** The severity of the log message. */
  var level: String
  
  /** The text of the log message. */
  var msg: String
}
object LogMessage {
  
  inline def apply(level: String, msg: String): LogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogMessage]
  }
  
  extension [Self <: LogMessage](x: Self) {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
  }
}
