package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cancellable extends StObject {
  
  /** If true, the request that reports progress may be cancelled with a `cancel` request.
  				So this property basically controls whether the client should use UX that supports cancellation.
  				Clients that don't support cancellation are allowed to ignore the setting.
  			*/
  var cancellable: js.UndefOr[Boolean] = js.undefined
  
  /** More detailed progress message. */
  var message: js.UndefOr[String] = js.undefined
  
  /** Progress percentage to display (value range: 0 to 100). If omitted no percentage is shown. */
  var percentage: js.UndefOr[Double] = js.undefined
  
  /** An ID that can be used in subsequent `progressUpdate` and `progressEnd` events to make them refer to the same progress reporting.
  				IDs must be unique within a debug session.
  			*/
  var progressId: String
  
  /** The request ID that this progress report is related to. If specified a debug adapter is expected to emit progress events for the long running request until the request has been either completed or cancelled.
  				If the request ID is omitted, the progress report is assumed to be related to some general activity of the debug adapter.
  			*/
  var requestId: js.UndefOr[Double] = js.undefined
  
  /** Short title of the progress reporting. Shown in the UI to describe the long running operation. */
  var title: String
}
object Cancellable {
  
  inline def apply(progressId: String, title: String): Cancellable = {
    val __obj = js.Dynamic.literal(progressId = progressId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cancellable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Cancellable] (val x: Self) extends AnyVal {
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    inline def setCancellableUndefined: Self = StObject.set(x, "cancellable", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPercentage(value: Double): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
    
    inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
    
    inline def setProgressId(value: String): Self = StObject.set(x, "progressId", value.asInstanceOf[js.Any])
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
