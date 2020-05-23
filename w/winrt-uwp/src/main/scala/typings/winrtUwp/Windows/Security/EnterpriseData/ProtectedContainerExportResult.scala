package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been exported to a container file. */
trait ProtectedContainerExportResult extends js.Object {
  /** The container file that has been exported from an enterprise protected file. */
  var file: StorageFile
  /** The protection status after an enterprise protected file has been exported to a container file. */
  var status: ProtectedImportExportStatus
}

object ProtectedContainerExportResult {
  @scala.inline
  def apply(file: StorageFile, status: ProtectedImportExportStatus): ProtectedContainerExportResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContainerExportResult]
  }
}

