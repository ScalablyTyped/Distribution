package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
@js.native
trait BufferProtectUnprotectResult extends js.Object {
  
  /** Gets the enterprise protected buffer that has been protected or unprotected. */
  var buffer: IBuffer = js.native
  
  /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
  var protectionInfo: DataProtectionInfo = js.native
}
object BufferProtectUnprotectResult {
  
  @scala.inline
  def apply(buffer: IBuffer, protectionInfo: DataProtectionInfo): BufferProtectUnprotectResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferProtectUnprotectResult]
  }
  
  @scala.inline
  implicit class BufferProtectUnprotectResultOps[Self <: BufferProtectUnprotectResult] (val x: Self) extends AnyVal {
    
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
    def setBuffer(value: IBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionInfo(value: DataProtectionInfo): Self = this.set("protectionInfo", value.asInstanceOf[js.Any])
  }
}
