package typings.winrtUwp.global.Windows.Media.Protection

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains a method that indicates whether a protection service has completed successfully. */
@JSGlobal("Windows.Media.Protection.MediaProtectionServiceCompletion")
@js.native
abstract class MediaProtectionServiceCompletion ()
  extends typings.winrtUwp.Windows.Media.Protection.MediaProtectionServiceCompletion {
  /**
    * Indicates whether a protection service has completed successfully.
    * @param success Indicates the successful completion of a protection service.
    */
  /* CompleteClass */
  override def complete(success: Boolean): Unit = js.native
}

