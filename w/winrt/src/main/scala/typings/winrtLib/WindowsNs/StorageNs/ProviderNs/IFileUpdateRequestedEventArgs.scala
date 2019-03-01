package typings
package winrtLib.WindowsNs.StorageNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestedEventArgs extends js.Object {
  var request: FileUpdateRequest
}

object IFileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
}

