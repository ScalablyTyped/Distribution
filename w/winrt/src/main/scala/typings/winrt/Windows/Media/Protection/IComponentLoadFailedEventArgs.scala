package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IComponentLoadFailedEventArgs extends js.Object {
  var completion: MediaProtectionServiceCompletion
  var information: RevocationAndRenewalInformation
}

object IComponentLoadFailedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): IComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IComponentLoadFailedEventArgs]
  }
}

