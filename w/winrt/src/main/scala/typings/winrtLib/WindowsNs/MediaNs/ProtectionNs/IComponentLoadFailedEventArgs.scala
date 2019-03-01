package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completion")(completion)
    __obj.updateDynamic("information")(information)
    __obj.asInstanceOf[IComponentLoadFailedEventArgs]
  }
}

