package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the ItemCompleted and ItemStatusChanged events. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallManagerItemEventArgs")
@js.native
abstract class AppInstallManagerItemEventArgs () extends js.Object {
  /** Gets an object that describes the app that has finished installing (for the ItemCompleted event) or whose installation status has changed (for the ItemStatusChanged event). */
  var item: AppInstallItem = js.native
}

