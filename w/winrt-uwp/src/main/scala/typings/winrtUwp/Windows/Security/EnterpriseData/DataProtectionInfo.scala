package typings.winrtUwp.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected buffer or stream. */
trait DataProtectionInfo extends js.Object {
  /** The enterprise identity of the enterprise protected buffer or stream. */
  var identity: String
  /** The protection status of the enterprise protected buffer or stream. */
  var status: DataProtectionStatus
}

object DataProtectionInfo {
  @scala.inline
  def apply(identity: String, status: DataProtectionStatus): DataProtectionInfo = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataProtectionInfo]
  }
}

