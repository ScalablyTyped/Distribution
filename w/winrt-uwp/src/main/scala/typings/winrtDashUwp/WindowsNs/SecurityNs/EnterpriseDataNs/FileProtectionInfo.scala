package typings.winrtDashUwp.WindowsNs.SecurityNs.EnterpriseDataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionInfo")
@js.native
abstract class FileProtectionInfo () extends js.Object {
  /** The enterprise identity of the enterprise protected file. */
  var identity: String = js.native
  /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
  var isRoamable: Boolean = js.native
  /** The protection status of the enterprise protected file. */
  var status: FileProtectionStatus = js.native
}

