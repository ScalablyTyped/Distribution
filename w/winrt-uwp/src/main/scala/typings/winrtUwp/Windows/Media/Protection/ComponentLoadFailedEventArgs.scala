package typings.winrtUwp.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
@js.native
trait ComponentLoadFailedEventArgs extends StObject {
  
  /** Returns an indication of the completion of the event. */
  var completion: MediaProtectionServiceCompletion = js.native
  
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  var information: RevocationAndRenewalInformation = js.native
}
object ComponentLoadFailedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
  
  @scala.inline
  implicit class ComponentLoadFailedEventArgsMutableBuilder[Self <: ComponentLoadFailedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletion(value: MediaProtectionServiceCompletion): Self = StObject.set(x, "completion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInformation(value: RevocationAndRenewalInformation): Self = StObject.set(x, "information", value.asInstanceOf[js.Any])
  }
}
