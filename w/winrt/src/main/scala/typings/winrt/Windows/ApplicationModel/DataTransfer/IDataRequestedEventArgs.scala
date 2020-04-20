package typings.winrt.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDataRequestedEventArgs extends js.Object {
  var request: DataRequest
}

object IDataRequestedEventArgs {
  @scala.inline
  def apply(request: DataRequest): IDataRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDataRequestedEventArgs]
  }
}

