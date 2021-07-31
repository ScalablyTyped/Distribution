package typings.winrt.Windows.Media.Protection

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentLoadFailedEventArgs
  extends StObject
     with IComponentLoadFailedEventArgs
object ComponentLoadFailedEventArgs {
  
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
}
