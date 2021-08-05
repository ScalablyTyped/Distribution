package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The status and message of the deletion request. */
trait FeedbackDeleted extends StObject {
  
  /** Status message returned from the service. */
  var message: js.UndefOr[String] = js.undefined
  
  /** HTTP return code. */
  var status: js.UndefOr[Double] = js.undefined
}
object FeedbackDeleted {
  
  inline def apply(): FeedbackDeleted = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeedbackDeleted]
  }
  
  extension [Self <: FeedbackDeleted](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
