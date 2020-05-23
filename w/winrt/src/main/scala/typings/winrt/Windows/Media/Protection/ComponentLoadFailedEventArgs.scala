package typings.winrt.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentLoadFailedEventArgs extends IComponentLoadFailedEventArgs

object ComponentLoadFailedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
}

