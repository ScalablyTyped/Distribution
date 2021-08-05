package typings.winrtUwp.Windows.Networking.BackgroundTransfer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result a request for unconstrained transfers from a BackgroundDownloader or BackgroundUploader object. */
trait UnconstrainedTransferRequestResult extends StObject {
  
  /** Gets a value that indicates if the download or upload operations will run without the resource restrictions normally associated with background network operations while a device running on battery. */
  var isUnconstrained: Boolean
}
object UnconstrainedTransferRequestResult {
  
  inline def apply(isUnconstrained: Boolean): UnconstrainedTransferRequestResult = {
    val __obj = js.Dynamic.literal(isUnconstrained = isUnconstrained.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnconstrainedTransferRequestResult]
  }
  
  extension [Self <: UnconstrainedTransferRequestResult](x: Self) {
    
    inline def setIsUnconstrained(value: Boolean): Self = StObject.set(x, "isUnconstrained", value.asInstanceOf[js.Any])
  }
}
