package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IComponentLoadFailedEventArgs extends StObject {
  
  var completion: MediaProtectionServiceCompletion
  
  var information: RevocationAndRenewalInformation
}
object IComponentLoadFailedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): IComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[IComponentLoadFailedEventArgs]
  }
  
  @scala.inline
  implicit class IComponentLoadFailedEventArgsMutableBuilder[Self <: IComponentLoadFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: RevocationAndRenewalInformation): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
  }
}
