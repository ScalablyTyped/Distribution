package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a delayed set version operation. */
@JSGlobal("Windows.Storage.SetVersionDeferral")
@js.native
abstract class SetVersionDeferral () extends js.Object {
  /** Notifies the system that the app has set the version of the application data in its app data store. */
  def complete(): scala.Unit = js.native
}

