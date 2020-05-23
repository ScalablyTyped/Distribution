package typings.winrtUwp.global.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app sets the version of the application data in its app data store. */
@JSGlobal("Windows.Storage.SetVersionRequest")
@js.native
abstract class SetVersionRequest ()
  extends typings.winrtUwp.Windows.Storage.SetVersionRequest {
  /** Gets the current version. */
  /* CompleteClass */
  override var currentVersion: Double = js.native
  /** Gets the requested version. */
  /* CompleteClass */
  override var desiredVersion: Double = js.native
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  /* CompleteClass */
  override def getDeferral(): typings.winrtUwp.Windows.Storage.SetVersionDeferral = js.native
}

