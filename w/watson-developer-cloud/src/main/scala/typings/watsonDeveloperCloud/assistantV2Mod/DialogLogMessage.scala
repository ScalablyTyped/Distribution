package typings.watsonDeveloperCloud.assistantV2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dialog log message details. */
trait DialogLogMessage extends StObject {
  
  /** The severity of the log message. */
  var level: String
  
  /** The text of the log message. */
  var message: String
}
object DialogLogMessage {
  
  inline def apply(level: String, message: String): DialogLogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogLogMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogLogMessage] (val x: Self) extends AnyVal {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
