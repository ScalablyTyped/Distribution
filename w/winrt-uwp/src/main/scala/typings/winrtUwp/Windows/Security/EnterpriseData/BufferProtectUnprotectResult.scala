package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
trait BufferProtectUnprotectResult extends StObject {
  
  /** Gets the enterprise protected buffer that has been protected or unprotected. */
  var buffer: IBuffer
  
  /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
  var protectionInfo: DataProtectionInfo
}
object BufferProtectUnprotectResult {
  
  @scala.inline
  def apply(buffer: IBuffer, protectionInfo: DataProtectionInfo): BufferProtectUnprotectResult = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], protectionInfo = protectionInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[BufferProtectUnprotectResult]
  }
  
  @scala.inline
  implicit class BufferProtectUnprotectResultMutableBuilder[Self <: BufferProtectUnprotectResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBuffer(value: IBuffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionInfo(value: DataProtectionInfo): Self = StObject.set(x, "protectionInfo", value.asInstanceOf[js.Any])
  }
}
