package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServiceRequestedEventArgs extends StObject {
  
  var completion: MediaProtectionServiceCompletion
  
  var request: IMediaProtectionServiceRequest
}
object IServiceRequestedEventArgs {
  
  inline def apply(completion: MediaProtectionServiceCompletion, request: IMediaProtectionServiceRequest): IServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceRequestedEventArgs]
  }
  
  extension [Self <: IServiceRequestedEventArgs](x: Self) {
    
    inline def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IMediaProtectionServiceRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
