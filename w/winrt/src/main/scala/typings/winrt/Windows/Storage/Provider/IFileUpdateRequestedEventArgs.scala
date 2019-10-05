package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFileUpdateRequestedEventArgs extends js.Object {
  var request: FileUpdateRequest
}

object IFileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): IFileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[IFileUpdateRequestedEventArgs]
  }
}

