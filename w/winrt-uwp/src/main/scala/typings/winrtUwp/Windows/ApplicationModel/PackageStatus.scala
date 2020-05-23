package typings.winrtUwp.Windows.ApplicationModel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the status of the package. */
trait PackageStatus extends js.Object {
  /** Indicates whether the data for the package is offline. */
  var dataOffline: Boolean
  /** Indicates whether this package depends on a package that can't be used. */
  var dependencyIssue: Boolean
  /** Indicates whether the package is being serviced. */
  var deploymentInProgress: Boolean
  /** Indicates whether the package has been disabled. */
  var disabled: Boolean
  /** Indicates whether there is a problem with the license for this package. */
  var licenseIssue: Boolean
  /** Indicates whether the package is missing files, system information, etc. */
  var modified: Boolean
  /** Indicates whether the package is unusable. */
  var needsRemediation: Boolean
  /** Indicates whether the package is available. */
  var notAvailable: Boolean
  /** Indicates whether the package is offline and cannot be used. */
  var packageOffline: Boolean
  /** Indicates whether the package is being serviced. */
  var servicing: Boolean
  /** Indicates whether the package may have been tampered with. */
  var tampered: Boolean
  /**
    * Indicates whether the package is in good condition and may be used.
    * @return TRUE indicates that the package is in good condition; otherwise FALSE.
    */
  def verifyIsOK(): Boolean
}

object PackageStatus {
  @scala.inline
  def apply(
    dataOffline: Boolean,
    dependencyIssue: Boolean,
    deploymentInProgress: Boolean,
    disabled: Boolean,
    licenseIssue: Boolean,
    modified: Boolean,
    needsRemediation: Boolean,
    notAvailable: Boolean,
    packageOffline: Boolean,
    servicing: Boolean,
    tampered: Boolean,
    verifyIsOK: () => Boolean
  ): PackageStatus = {
    val __obj = js.Dynamic.literal(dataOffline = dataOffline.asInstanceOf[js.Any], dependencyIssue = dependencyIssue.asInstanceOf[js.Any], deploymentInProgress = deploymentInProgress.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], licenseIssue = licenseIssue.asInstanceOf[js.Any], modified = modified.asInstanceOf[js.Any], needsRemediation = needsRemediation.asInstanceOf[js.Any], notAvailable = notAvailable.asInstanceOf[js.Any], packageOffline = packageOffline.asInstanceOf[js.Any], servicing = servicing.asInstanceOf[js.Any], tampered = tampered.asInstanceOf[js.Any], verifyIsOK = js.Any.fromFunction0(verifyIsOK))
    __obj.asInstanceOf[PackageStatus]
  }
}

