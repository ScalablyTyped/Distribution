package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a newly created enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.ProtectedFileCreateResult")
@js.native
abstract class ProtectedFileCreateResult () extends js.Object {
  /** The newly created enterprise protected file. */
  var file: winrtDashUwpLib.WindowsNs.StorageNs.StorageFile = js.native
  /** Information about the enterprise protected file. */
  var protectionInfo: FileProtectionInfo = js.native
  /** The stream random access to the newly created enterprise protected file. */
  var stream: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream = js.native
}

