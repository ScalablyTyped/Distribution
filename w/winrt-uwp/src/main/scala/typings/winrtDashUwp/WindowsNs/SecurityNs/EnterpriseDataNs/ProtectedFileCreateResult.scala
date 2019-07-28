package typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs

import typings.winrtDashUwp.WindowsNs.StorageNs.StorageFile
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
@js.native
abstract class ProtectedFileCreateResult () extends js.Object {
  /** The newly created enterprise protected file. */
  var file: StorageFile = js.native
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo = js.native
  /** The stream random access to the newly created enterprise protected file. */
  var stream: IRandomAccessStream = js.native
}

