package typings.winrt.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamedFileDataRequest extends js.Object {
  def failAndClose(failureMode: StreamedFileFailureMode): Unit
}

object IStreamedFileDataRequest {
  @scala.inline
  def apply(failAndClose: StreamedFileFailureMode => Unit): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = js.Any.fromFunction1(failAndClose))
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
}

