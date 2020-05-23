package typings.winrtUwp.Windows.ApplicationModel.Core

import typings.winrtUwp.Windows.ApplicationModel.AppDisplayInfo
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides an app's display info such as its display name and description, and a method to launch the app. */
trait AppListEntry extends js.Object {
  /** Provides an app's display name, description, and logo. */
  var displayInfo: AppDisplayInfo
  /**
    * Launches the app associated with this AppListEntry
    * @return If the launch fails for any reason, the Boolean value is false
    */
  def launchAsync(): IPromiseWithIAsyncOperation[Boolean]
}

object AppListEntry {
  @scala.inline
  def apply(displayInfo: AppDisplayInfo, launchAsync: () => IPromiseWithIAsyncOperation[Boolean]): AppListEntry = {
    val __obj = js.Dynamic.literal(displayInfo = displayInfo.asInstanceOf[js.Any], launchAsync = js.Any.fromFunction0(launchAsync))
    __obj.asInstanceOf[AppListEntry]
  }
}

