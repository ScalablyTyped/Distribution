package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.StoreNs.PreviewNs.InstallControlNs

import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Describes the status of an app that is in the installation queue. */
@JSGlobal("Windows.ApplicationModel.Store.Preview.InstallControl.AppInstallStatus")
@js.native
abstract class AppInstallStatus () extends js.Object {
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

