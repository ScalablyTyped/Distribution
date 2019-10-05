package typings.winrtDashUwp.Windows.Security.EnterpriseData

import typings.winrtDashUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
@JSGlobal("Windows.Security.EnterpriseData.BufferProtectUnprotectResult")
@js.native
abstract class BufferProtectUnprotectResult () extends js.Object {
  /** Gets the enterprise protected buffer that has been protected or unprotected. */
  var buffer: IBuffer = js.native
  /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
  var protectionInfo: DataProtectionInfo = js.native
}

