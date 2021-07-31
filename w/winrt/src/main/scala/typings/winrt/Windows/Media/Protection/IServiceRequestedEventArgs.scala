package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IServiceRequestedEventArgs extends StObject {
  
  var completion: MediaProtectionServiceCompletion
  
  var request: IMediaProtectionServiceRequest
}
object IServiceRequestedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, request: IMediaProtectionServiceRequest): IServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceRequestedEventArgs]
  }
  
  @scala.inline
  implicit class IServiceRequestedEventArgsMutableBuilder[Self <: IServiceRequestedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequest(value: IMediaProtectionServiceRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
