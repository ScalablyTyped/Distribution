package typings.winrtUwp.global.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the result of an enterprise protected file that has been imported from a container file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedContainerImportResult")
@js.native
abstract class ProtectedContainerImportResult ()
  extends typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedContainerImportResult {
  /** The enterprise protected file that has been loaded from a container file. */
  /* CompleteClass */
  override var file: StorageFile = js.native
  /** The protection status after an enterprise protected file has been imported from a container file. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Security.EnterpriseData.ProtectedImportExportStatus = js.native
}

