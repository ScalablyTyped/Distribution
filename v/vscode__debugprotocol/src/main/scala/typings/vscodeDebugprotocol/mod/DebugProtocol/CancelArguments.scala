package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `cancel` request. */
trait CancelArguments extends StObject {
  
  /** The ID (attribute `progressId`) of the progress to cancel. If missing no progress is cancelled.
  			Both a `requestId` and a `progressId` can be specified in one request.
  		*/
  var progressId: js.UndefOr[String] = js.undefined
  
  /** The ID (attribute `seq`) of the request to cancel. If missing no request is cancelled.
  			Both a `requestId` and a `progressId` can be specified in one request.
  		*/
  var requestId: js.UndefOr[Double] = js.undefined
}
object CancelArguments {
  
  inline def apply(): CancelArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelArguments]
  }
  
  extension [Self <: CancelArguments](x: Self) {
    
    inline def setProgressId(value: String): Self = StObject.set(x, "progressId", value.asInstanceOf[js.Any])
    
    inline def setProgressIdUndefined: Self = StObject.set(x, "progressId", js.undefined)
    
    inline def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
