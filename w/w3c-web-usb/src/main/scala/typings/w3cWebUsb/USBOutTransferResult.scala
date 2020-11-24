package typings.w3cWebUsb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait USBOutTransferResult extends js.Object {
  
  val bytesWritten: Double = js.native
  
  val status: USBTransferStatus = js.native
}
object USBOutTransferResult {
  
  @scala.inline
  def apply(bytesWritten: Double, status: USBTransferStatus): USBOutTransferResult = {
    val __obj = js.Dynamic.literal(bytesWritten = bytesWritten.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[USBOutTransferResult]
  }
  
  @scala.inline
  implicit class USBOutTransferResultOps[Self <: USBOutTransferResult] (val x: Self) extends AnyVal {
    
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
    def setBytesWritten(value: Double): Self = this.set("bytesWritten", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: USBTransferStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
