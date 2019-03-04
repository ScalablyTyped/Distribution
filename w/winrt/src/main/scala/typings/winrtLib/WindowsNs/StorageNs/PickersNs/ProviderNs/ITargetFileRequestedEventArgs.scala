package typings
package winrtLib.WindowsNs.StorageNs.PickersNs.ProviderNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITargetFileRequestedEventArgs extends js.Object {
  var request: TargetFileRequest
}

object ITargetFileRequestedEventArgs {
  @scala.inline
  def apply(request: TargetFileRequest): ITargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[ITargetFileRequestedEventArgs]
  }
}

