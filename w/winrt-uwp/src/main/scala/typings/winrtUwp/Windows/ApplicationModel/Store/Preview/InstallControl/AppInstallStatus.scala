package typings.winrtUwp.Windows.ApplicationModel.Store.Preview.InstallControl

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the status of an app that is in the installation queue. */
trait AppInstallStatus extends js.Object {
  /** Gets the number of bytes that have been downloaded for the current app. */
  var bytesDownloaded: Double
  /** Gets the download size in bytes for the current app. */
  var downloadSizeInBytes: Double
  /** Gets the error code for an app that has encountered an installation failure. */
  var errorCode: WinRTError
  /** Gets the installation state of the current app. */
  var installState: AppInstallState
  /** Gets the completion percentage for the installation of the current app. */
  var percentComplete: Double
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
}

