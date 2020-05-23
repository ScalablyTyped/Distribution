package typings.winrtUwp.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
trait BufferProtectUnprotectResult extends js.Object {
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
}

