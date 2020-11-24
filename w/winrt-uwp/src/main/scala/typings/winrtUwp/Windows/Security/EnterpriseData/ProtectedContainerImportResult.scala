package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of an enterprise protected file that has been imported from a container file. */
@js.native
trait ProtectedContainerImportResult extends js.Object {
  
  /** The enterprise protected file that has been loaded from a container file. */
  var file: StorageFile = js.native
  
  /** The protection status after an enterprise protected file has been imported from a container file. */
  var status: ProtectedImportExportStatus = js.native
}
object ProtectedContainerImportResult {
  
  @scala.inline
  def apply(file: StorageFile, status: ProtectedImportExportStatus): ProtectedContainerImportResult = {
    val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProtectedContainerImportResult]
  }
  
  @scala.inline
  implicit class ProtectedContainerImportResultOps[Self <: ProtectedContainerImportResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFile(value: StorageFile): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: ProtectedImportExportStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
