package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Dialog log message details. */
@js.native
trait DialogLogMessage extends StObject {
  
  /** The severity of the log message. */
  var level: String = js.native
  
  /** The text of the log message. */
  var message: String = js.native
}
object DialogLogMessage {
  
  @scala.inline
  def apply(level: String, message: String): DialogLogMessage = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogLogMessage]
  }
  
  @scala.inline
  implicit class DialogLogMessageMutableBuilder[Self <: DialogLogMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
