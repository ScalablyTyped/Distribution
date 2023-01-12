package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
trait ComponentLoadFailedEventArgs extends StObject {
  
  /** Returns an indication of the completion of the event. */
  var completion: MediaProtectionServiceCompletion
  
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  var information: RevocationAndRenewalInformation
}
object ComponentLoadFailedEventArgs {
  
  inline def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ComponentLoadFailedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    inline def setInformation(value: RevocationAndRenewalInformation): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
  }
}
