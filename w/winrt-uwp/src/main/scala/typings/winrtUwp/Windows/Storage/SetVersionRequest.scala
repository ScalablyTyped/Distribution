package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app sets the version of the application data in its app data store. */
trait SetVersionRequest extends js.Object {
  /** Gets the current version. */
  var currentVersion: Double
  /** Gets the requested version. */
  var desiredVersion: Double
  /**
    * Requests that the set version request be delayed.
    * @return The set version deferral.
    */
  def getDeferral(): SetVersionDeferral
}

object SetVersionRequest {
  @scala.inline
  def apply(currentVersion: Double, desiredVersion: Double, getDeferral: () => SetVersionDeferral): SetVersionRequest = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], desiredVersion = desiredVersion.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral))
    __obj.asInstanceOf[SetVersionRequest]
  }
}

