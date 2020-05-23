package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected file. */
trait FileProtectionInfo extends js.Object {
  /** The enterprise identity of the enterprise protected file. */
  var identity: String
  /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
  var isRoamable: Boolean
  /** The protection status of the enterprise protected file. */
  var status: FileProtectionStatus
}

object FileProtectionInfo {
  @scala.inline
  def apply(identity: String, isRoamable: Boolean, status: FileProtectionStatus): FileProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], isRoamable = isRoamable.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileProtectionInfo]
  }
}

