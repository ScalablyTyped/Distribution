package typings
package winrtDashUwpLib.WindowsNs.ServicesNs.StoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides status info for a package that is associated with a download or installation request. */

trait StorePackageUpdateStatus extends js.Object {
  /** The number of bytes that have been downloaded. */
  var packageBytesDownloaded: scala.Double
  /** The download (or download and install) progress of the current package, represented by a value from 0.0 to 1.0. When you use RequestDownloadStorePackageUpdatesAsync to download packages, this value increases from 0.0 to 1.0 during the download of each package. When you use RequestDownloadAndInstallStorePackageUpdatesAsync to download and install packages in a single operation, this value increases from 0.0 to 0.8 during the download of each package, and then it increases from 0.8 to 1.0 during the install phase. */
  var packageDownloadProgress: scala.Double
  /** The size of the package that is being downloaded, in bytes. This is an estimate, and it might change during the download process. */
  var packageDownloadSizeInBytes: scala.Double
  /** The family name of the package that is being downloaded or installed. */
  var packageFamilyName: java.lang.String
  /** A StorePackageUpdateState value that indicates the state of the package that is being downloaded or installed. */
  var packageUpdateState: StorePackageUpdateState
  /** The current progress of all package downloads in the request, represented by a value from 0.0 to 1.0. */
  var totalDownloadProgress: scala.Double
}

