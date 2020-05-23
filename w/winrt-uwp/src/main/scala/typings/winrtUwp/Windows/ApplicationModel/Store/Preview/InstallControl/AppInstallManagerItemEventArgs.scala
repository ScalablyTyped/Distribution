package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ItemCompleted and ItemStatusChanged events. */
trait AppInstallManagerItemEventArgs extends js.Object {
  /** Gets an object that describes the app that has finished installing (for the ItemCompleted event) or whose installation status has changed (for the ItemStatusChanged event). */
  var item: AppInstallItem
}

object AppInstallManagerItemEventArgs {
  @scala.inline
  def apply(item: AppInstallItem): AppInstallManagerItemEventArgs = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstallManagerItemEventArgs]
  }
}

