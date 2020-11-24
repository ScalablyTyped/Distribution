package typings.winrtUwp.Windows.Devices.PointOfService

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the ErrorOccurred event. */
@js.native
trait BarcodeScannerErrorOccurredEventArgs extends js.Object {
  
  /** Gets the data associated with the ErrorOccurred event. */
  var errorData: UnifiedPosErrorData = js.native
  
  /** Indicates whether it is worthwhile to make another attempt at the operation. */
  var isRetriable: Boolean = js.native
  
  /** Gets any data that was successfully read. */
  var partialInputData: BarcodeScannerReport = js.native
}
object BarcodeScannerErrorOccurredEventArgs {
  
  @scala.inline
  def apply(errorData: UnifiedPosErrorData, isRetriable: Boolean, partialInputData: BarcodeScannerReport): BarcodeScannerErrorOccurredEventArgs = {
    val __obj = js.Dynamic.literal(errorData = errorData.asInstanceOf[js.Any], isRetriable = isRetriable.asInstanceOf[js.Any], partialInputData = partialInputData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarcodeScannerErrorOccurredEventArgs]
  }
  
  @scala.inline
  implicit class BarcodeScannerErrorOccurredEventArgsOps[Self <: BarcodeScannerErrorOccurredEventArgs] (val x: Self) extends AnyVal {
    
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
    def setErrorData(value: UnifiedPosErrorData): Self = this.set("errorData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRetriable(value: Boolean): Self = this.set("isRetriable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartialInputData(value: BarcodeScannerReport): Self = this.set("partialInputData", value.asInstanceOf[js.Any])
  }
}
