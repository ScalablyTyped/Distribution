package typings.winrtUwp.global.Windows.Security.EnterpriseData

import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about the result from protecting or unprotecting an enterprise protected buffer. */
@JSGlobal("Windows.Security.EnterpriseData.BufferProtectUnprotectResult")
@js.native
abstract class BufferProtectUnprotectResult ()
  extends typings.winrtUwp.Windows.Security.EnterpriseData.BufferProtectUnprotectResult {
  /** Gets the enterprise protected buffer that has been protected or unprotected. */
  /* CompleteClass */
  override var buffer: IBuffer = js.native
  /** Gets the DataProtectionInfo object concerning the enterprise protected buffer that has been protected or unprotected. */
  /* CompleteClass */
  override var protectionInfo: typings.winrtUwp.Windows.Security.EnterpriseData.DataProtectionInfo = js.native
}

