package typings.winrt.Windows.Media.Protection

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
    val __obj = js.Dynamic.literal(completion = completion.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IServiceRequestedEventArgs]
  }
}

