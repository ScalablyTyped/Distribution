package typings.winrt.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileUpdateRequestedEventArgs extends IFileUpdateRequestedEventArgs

object FileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): FileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpdateRequestedEventArgs]
  }
}

