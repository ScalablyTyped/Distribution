package typings.winrtDashUwp.Windows.Security.EnterpriseData

import typings.winrtDashUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been exported to a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerExportResult")
@js.native
abstract class ProtectedContainerExportResult () extends js.Object {
  /** The container file that has been exported from an enterprise protected file. */
  var file: StorageFile = js.native
  /** The protection status after an enterprise protected file has been exported to a container file. */
  var status: ProtectedImportExportStatus = js.native
}

