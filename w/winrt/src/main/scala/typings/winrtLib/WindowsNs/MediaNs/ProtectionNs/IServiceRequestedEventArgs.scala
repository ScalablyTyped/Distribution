package typings
package winrtLib.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceRequestedEventArgs extends js.Object {
  var completion: MediaProtectionServiceCompletion
  var request: IMediaProtectionServiceRequest
}

object IServiceRequestedEventArgs {
  @scala.inline
  def apply(completion: MediaProtectionServiceCompletion, request: IMediaProtectionServiceRequest): IServiceRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("completion")(completion)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IServiceRequestedEventArgs]
  }
}

