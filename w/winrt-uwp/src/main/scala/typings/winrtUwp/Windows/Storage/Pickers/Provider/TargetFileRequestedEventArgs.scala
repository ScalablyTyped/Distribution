package typings.winrtUwp.Windows.Storage.Pickers.Provider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about a targetfilerequested event. */
trait TargetFileRequestedEventArgs extends js.Object {
  /** Gets a targetFileRequest object that is used to respond to a targetfilerequested event. */
  var request: TargetFileRequest
}

object TargetFileRequestedEventArgs {
  @scala.inline
  def apply(request: TargetFileRequest): TargetFileRequestedEventArgs = {
    val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetFileRequestedEventArgs]
  }
}

