package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressId extends StObject {
  
  /** More detailed progress message. If omitted, the previous message (if any) is used. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The ID that was introduced in the initial `ProgressStartEvent`. */
  var progressId: String
}
object ProgressId {
  
  inline def apply(progressId: String): ProgressId = {
    val __obj = js.Dynamic.literal(progressId = progressId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressId]
  }
  
  extension [Self <: ProgressId](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setProgressId(value: String): Self = StObject.set(x, "progressId", value.asInstanceOf[js.Any])
  }
}
