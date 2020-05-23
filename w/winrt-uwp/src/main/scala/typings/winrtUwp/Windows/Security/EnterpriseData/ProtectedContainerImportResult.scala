package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been imported from a container file. */
trait ProtectedContainerImportResult extends js.Object {
  /** The enterprise protected file that has been loaded from a container file. */
  var file: StorageFile
  /** The protection status after an enterprise protected file has been imported from a container file. */
  var status: ProtectedImportExportStatus
}

object ProtectedContainerImportResult {
  @scala.inline
  def apply(file: StorageFile, status: ProtectedImportExportStatus): ProtectedContainerImportResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContainerImportResult]
  }
}

