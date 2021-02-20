package typings.winrtUwp.Windows.Devices.Scanners

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the result of a preview scan job. */
@js.native
trait ImageScannerPreviewResult extends StObject {
  
  /** Gets the format of the data for the scan preview. After preview this property is restored to the value before preview. */
  var format: ImageScannerFormat = js.native
  
  /** Gets whether the scan preview was successful. */
  var succeeded: Boolean = js.native
}
object ImageScannerPreviewResult {
  
  @scala.inline
  def apply(format: ImageScannerFormat, succeeded: Boolean): ImageScannerPreviewResult = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageScannerPreviewResult]
  }
  
  @scala.inline
  implicit class ImageScannerPreviewResultMutableBuilder[Self <: ImageScannerPreviewResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: ImageScannerFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
