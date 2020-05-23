package typings.winrtUwp.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains event data for a MediaProtectionManager object when the load of binary data fails. */
trait ComponentLoadFailedEventArgs extends js.Object {
  /** Returns an indication of the completion of the event. */
  var completion: MediaProtectionServiceCompletion
  /** Returns a list of components in the RevocationAndRenewalInformation object that need to be revoked and renewed with updated components. */
  var information: RevocationAndRenewalInformation
}

object ComponentLoadFailedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, information: RevocationAndRenewalInformation): ComponentLoadFailedEventArgs = {
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], information = information.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentLoadFailedEventArgs]
  }
}

