package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamedFileDataRequest extends js.Object {
  def failAndClose(failureMode: StreamedFileFailureMode): scala.Unit
}

object IStreamedFileDataRequest {
  @scala.inline
  def apply(failAndClose: js.Function1[StreamedFileFailureMode, scala.Unit]): IStreamedFileDataRequest = {
    val __obj = js.Dynamic.literal(failAndClose = failAndClose)
  
    __obj.asInstanceOf[IStreamedFileDataRequest]
  }
}

