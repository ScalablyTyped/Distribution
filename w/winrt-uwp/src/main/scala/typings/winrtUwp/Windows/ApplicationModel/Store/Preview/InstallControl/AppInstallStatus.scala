package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the status of an app that is in the installation queue. */
@js.native
trait AppInstallStatus extends js.Object {
  
  /** Gets the number of bytes that have been downloaded for the current app. */
  var bytesDownloaded: Double = js.native
  
  /** Gets the download size in bytes for the current app. */
  var downloadSizeInBytes: Double = js.native
  
  /** Gets the error code for an app that has encountered an installation failure. */
  var errorCode: WinRTError = js.native
  
  /** Gets the installation state of the current app. */
  var installState: AppInstallState = js.native
  
  /** Gets the completion percentage for the installation of the current app. */
  var percentComplete: Double = js.native
}
object AppInstallStatus {
  
  @scala.inline
  def apply(
    bytesDownloaded: Double,
    downloadSizeInBytes: Double,
    errorCode: WinRTError,
    installState: AppInstallState,
    percentComplete: Double
  ): AppInstallStatus = {
    val __obj = js.Dynamic.literal(bytesDownloaded = bytesDownloaded.asInstanceOf[js.Any], downloadSizeInBytes = downloadSizeInBytes.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], installState = installState.asInstanceOf[js.Any], percentComplete = percentComplete.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppInstallStatus]
  }
  
  @scala.inline
  implicit class AppInstallStatusOps[Self <: AppInstallStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBytesDownloaded(value: Double): Self = this.set("bytesDownloaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadSizeInBytes(value: Double): Self = this.set("downloadSizeInBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCode(value: WinRTError): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstallState(value: AppInstallState): Self = this.set("installState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentComplete(value: Double): Self = this.set("percentComplete", value.asInstanceOf[js.Any])
  }
}
