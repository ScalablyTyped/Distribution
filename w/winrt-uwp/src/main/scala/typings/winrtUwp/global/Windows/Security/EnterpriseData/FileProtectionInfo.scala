package typings.winrtUwp.global.Windows.Security.EnterpriseData

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about an enterprise protected file. */
@JSGlobal("Windows.Security.EnterpriseData.FileProtectionInfo")
@js.native
abstract class FileProtectionInfo ()
  extends typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionInfo {
  /** The enterprise identity of the enterprise protected file. */
  /* CompleteClass */
  override var identity: String = js.native
  /** Specifies if the protection of the enterprise protected file can be roamed to other devices. */
  /* CompleteClass */
  override var isRoamable: Boolean = js.native
  /** The protection status of the enterprise protected file. */
  /* CompleteClass */
  override var status: typings.winrtUwp.Windows.Security.EnterpriseData.FileProtectionStatus = js.native
}

