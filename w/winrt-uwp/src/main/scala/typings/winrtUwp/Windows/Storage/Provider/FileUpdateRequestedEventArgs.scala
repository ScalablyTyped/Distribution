package typings.winrtUwp.Windows.Storage.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a FileUpdateRequested event. */
trait FileUpdateRequestedEventArgs extends js.Object {
  /** Gets the details of the requested file update. */
  var request: FileUpdateRequest
}

object FileUpdateRequestedEventArgs {
  @scala.inline
  def apply(request: FileUpdateRequest): FileUpdateRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileUpdateRequestedEventArgs]
  }
}

