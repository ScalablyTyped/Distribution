package typings.winrtUwp.Windows.Services.Store

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides status info for a package that is associated with a download or installation request. */
@js.native
trait StorePackageUpdateStatus extends StObject {
  
  /** The number of bytes that have been downloaded. */
  var packageBytesDownloaded: Double = js.native
  
  /** The download (or download and install) progress of the current package, represented by a value from 0.0 to 1.0. When you use RequestDownloadStorePackageUpdatesAsync to download packages, this value increases from 0.0 to 1.0 during the download of each package. When you use RequestDownloadAndInstallStorePackageUpdatesAsync to download and install packages in a single operation, this value increases from 0.0 to 0.8 during the download of each package, and then it increases from 0.8 to 1.0 during the install phase. */
  var packageDownloadProgress: Double = js.native
  
  /** The size of the package that is being downloaded, in bytes. This is an estimate, and it might change during the download process. */
  var packageDownloadSizeInBytes: Double = js.native
  
  /** The family name of the package that is being downloaded or installed. */
  var packageFamilyName: String = js.native
  
  /** A StorePackageUpdateState value that indicates the state of the package that is being downloaded or installed. */
  var packageUpdateState: StorePackageUpdateState = js.native
  
  /** The current progress of all package downloads in the request, represented by a value from 0.0 to 1.0. */
  var totalDownloadProgress: Double = js.native
}
object StorePackageUpdateStatus {
  
  @scala.inline
  def apply(
    packageBytesDownloaded: Double,
    packageDownloadProgress: Double,
    packageDownloadSizeInBytes: Double,
    packageFamilyName: String,
    packageUpdateState: StorePackageUpdateState,
    totalDownloadProgress: Double
  ): StorePackageUpdateStatus = {
    val __obj = js.Dynamic.literal(packageBytesDownloaded = packageBytesDownloaded.asInstanceOf[js.Any], packageDownloadProgress = packageDownloadProgress.asInstanceOf[js.Any], packageDownloadSizeInBytes = packageDownloadSizeInBytes.asInstanceOf[js.Any], packageFamilyName = packageFamilyName.asInstanceOf[js.Any], packageUpdateState = packageUpdateState.asInstanceOf[js.Any], totalDownloadProgress = totalDownloadProgress.asInstanceOf[js.Any])
    __obj.asInstanceOf[StorePackageUpdateStatus]
  }
  
  @scala.inline
  implicit class StorePackageUpdateStatusMutableBuilder[Self <: StorePackageUpdateStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPackageBytesDownloaded(value: Double): Self = StObject.set(x, "packageBytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDownloadProgress(value: Double): Self = StObject.set(x, "packageDownloadProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageDownloadSizeInBytes(value: Double): Self = StObject.set(x, "packageDownloadSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageFamilyName(value: String): Self = StObject.set(x, "packageFamilyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageUpdateState(value: StorePackageUpdateState): Self = StObject.set(x, "packageUpdateState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalDownloadProgress(value: Double): Self = StObject.set(x, "totalDownloadProgress", value.asInstanceOf[js.Any])
  }
}
