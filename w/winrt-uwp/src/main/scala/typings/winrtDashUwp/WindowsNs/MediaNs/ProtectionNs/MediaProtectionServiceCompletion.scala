package typings.winrtDashUwp.WindowsNs.MediaNs.ProtectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a method that indicates whether a protection service has completed successfully. */
@JSGlobal("Windows.Media.Protection.MediaProtectionServiceCompletion")
@js.native
abstract class MediaProtectionServiceCompletion () extends js.Object {
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  def complete(success: Boolean): Unit = js.native
}

