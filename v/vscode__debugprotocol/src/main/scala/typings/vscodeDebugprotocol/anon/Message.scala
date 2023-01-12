package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Message extends StObject {
  
  /** More detailed progress message. If omitted, the previous message (if any) is used. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Progress percentage to display (value range: 0 to 100). If omitted no percentage is shown. */
  var percentage: js.UndefOr[Double] = js.undefined
  
  /** The ID that was introduced in the initial `progressStart` event. */
  var progressId: String
}
object Message {
  
  inline def apply(progressId: String): Message = {
    val __obj = js.Dynamic.literal(progressId = progressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setProgressId(value: String): Self = StObject.set(x, "progressId", value.asInstanceOf[js.Any])
  }
}
