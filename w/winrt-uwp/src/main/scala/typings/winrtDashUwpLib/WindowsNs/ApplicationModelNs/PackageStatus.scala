package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the status of the package. */
@JSGlobal("Windows.ApplicationModel.PackageStatus")
@js.native
abstract class PackageStatus () extends js.Object {
  /** Indicates whether the data for the package is offline. */
  var dataOffline: scala.Boolean = js.native
  /** Indicates whether this package depends on a package that can't be used. */
  var dependencyIssue: scala.Boolean = js.native
  /** Indicates whether the package is being serviced. */
  var deploymentInProgress: scala.Boolean = js.native
  /** Indicates whether the package has been disabled. */
  var disabled: scala.Boolean = js.native
  /** Indicates whether there is a problem with the license for this package. */
  var licenseIssue: scala.Boolean = js.native
  /** Indicates whether the package is missing files, system information, etc. */
  var modified: scala.Boolean = js.native
  /** Indicates whether the package is unusable. */
  var needsRemediation: scala.Boolean = js.native
  /** Indicates whether the package is available. */
  var notAvailable: scala.Boolean = js.native
  /** Indicates whether the package is offline and cannot be used. */
  var packageOffline: scala.Boolean = js.native
  /** Indicates whether the package is being serviced. */
  var servicing: scala.Boolean = js.native
  /** Indicates whether the package may have been tampered with. */
  var tampered: scala.Boolean = js.native
  /**
               * Indicates whether the package is in good condition and may be used.
               * @return TRUE indicates that the package is in good condition; otherwise FALSE.
               */
  def verifyIsOK(): scala.Boolean = js.native
}

