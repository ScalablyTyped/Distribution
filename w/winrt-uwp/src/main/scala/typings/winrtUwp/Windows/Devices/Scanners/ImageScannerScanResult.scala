package typings.winrtUwp.Windows.Devices.Scanners

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Storage.StorageFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a scan job. */
trait ImageScannerScanResult extends StObject {
  
  /** Gets the list of scanned image files that was produced by the completed scan job. */
  var scannedFiles: IVectorView[StorageFile]
}
object ImageScannerScanResult {
  
  inline def apply(scannedFiles: IVectorView[StorageFile]): ImageScannerScanResult = {
    val __obj = js.Dynamic.literal(scannedFiles = scannedFiles.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerScanResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageScannerScanResult] (val x: Self) extends AnyVal {
    
    inline def setScannedFiles(value: IVectorView[StorageFile]): Self = StObject.set(x, "scannedFiles", value.asInstanceOf[js.Any])
  }
}
