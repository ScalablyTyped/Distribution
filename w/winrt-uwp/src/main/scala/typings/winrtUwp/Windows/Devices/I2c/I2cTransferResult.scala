package typings.winrtUwp.Windows.Devices.I2c

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about whether the data transfers that the ReadPartial , WritePartial , or WriteReadPartial method performed succeeded, and the actual number of bytes the method transferred. */
@js.native
trait I2cTransferResult extends js.Object {
  
  /** The actual number of bytes that the operation actually transferred. The following table describes what this value represents for each method. */
  var bytesTransferred: Double = js.native
  
  /** An enumeration value that indicates if the read or write operation transferred the full number of bytes that the method requested, or the reason that the full transfer did not succeed. For WriteReadPartial , the value indicates whether the data for both the write and the read operations was entirely transferred. */
  var status: I2cTransferStatus = js.native
}
object I2cTransferResult {
  
  @scala.inline
  def apply(bytesTransferred: Double, status: I2cTransferStatus): I2cTransferResult = {
    val __obj = js.Dynamic.literal(bytesTransferred = bytesTransferred.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[I2cTransferResult]
  }
  
  @scala.inline
  implicit class I2cTransferResultOps[Self <: I2cTransferResult] (val x: Self) extends AnyVal {
    
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
    def setBytesTransferred(value: Double): Self = this.set("bytesTransferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: I2cTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
