package typings.winrtUwp.global.Windows.ApplicationModel

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Core")
@js.native
object Core extends js.Object {
  /** Provides an app's display info such as its display name and description, and a method to launch the app. */
  @js.native
  abstract class AppListEntry ()
    extends typings.winrtUwp.Windows.ApplicationModel.Core.AppListEntry {
    /** Provides an app's display name, description, and logo. */
    /* CompleteClass */
    override var displayInfo: typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo = js.native
    /**
      * Launches the app associated with this AppListEntry
      * @return If the launch fails for any reason, the Boolean value is false
      */
    /* CompleteClass */
    override def launchAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  }
  
}

