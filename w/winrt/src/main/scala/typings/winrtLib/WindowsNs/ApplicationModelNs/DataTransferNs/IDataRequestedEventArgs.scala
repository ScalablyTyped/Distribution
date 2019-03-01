package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequestedEventArgs extends js.Object {
  var request: DataRequest
}

object IDataRequestedEventArgs {
  @scala.inline
  def apply(request: DataRequest): IDataRequestedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[IDataRequestedEventArgs]
  }
}

