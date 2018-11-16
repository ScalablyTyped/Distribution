package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.CoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an app's display info such as its display name and description, and a method to launch the app. */
@JSGlobal("Windows.ApplicationModel.Core.AppListEntry")
@js.native
abstract class AppListEntry () extends js.Object {
  /** Provides an app's display name, description, and logo. */
  var displayInfo: winrtDashUwpLib.WindowsNs.ApplicationModelNs.AppDisplayInfo = js.native
  /**
                   * Launches the app associated with this AppListEntry
                   * @return If the launch fails for any reason, the Boolean value is false
                   */
  def launchAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
}

