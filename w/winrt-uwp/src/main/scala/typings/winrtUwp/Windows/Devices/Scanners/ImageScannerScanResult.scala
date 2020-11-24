package typings.winrtUwp.Windows.Devices.Scanners

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.StorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a scan job. */
@js.native
trait ImageScannerScanResult extends js.Object {
  
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: IVectorView[StorageFile] = js.native
}
object ImageScannerScanResult {
  
  @scala.inline
  def apply(scannedFiles: IVectorView[StorageFile]): ImageScannerScanResult = {
    val __obj = js.Dynamic.literal(scannedFiles = scannedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerScanResult]
  }
  
  @scala.inline
  implicit class ImageScannerScanResultOps[Self <: ImageScannerScanResult] (val x: Self) extends AnyVal {
    
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
    def setScannedFiles(value: IVectorView[StorageFile]): Self = this.set("scannedFiles", value.asInstanceOf[js.Any])
  }
}
