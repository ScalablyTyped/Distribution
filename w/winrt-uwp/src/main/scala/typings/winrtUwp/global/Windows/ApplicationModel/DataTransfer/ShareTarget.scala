package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the classes and events that a target app uses to complete share operations and create shortcuts, called QuickLinks, that the system can use to streamline future sharing operations to the app. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget")
@js.native
object ShareTarget extends js.Object {
  /** Represents shortcuts that help users share content with the apps they use most. */
  @js.native
  /** Creates a new instance of a QuickLink object. */
  class QuickLink ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink
  
  /** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
  @js.native
  abstract class ShareOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  
}

