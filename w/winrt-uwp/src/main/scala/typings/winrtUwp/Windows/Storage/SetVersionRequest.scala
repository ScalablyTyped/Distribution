package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app sets the version of the application data in its app data store. */
@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
abstract class SetVersionRequest () extends js.Object {
  /** Gets the current version. */
  var currentVersion: Double = js.native
  /** Gets the requested version. */
  var desiredVersion: Double = js.native
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  def getDeferral(): SetVersionDeferral = js.native
}

