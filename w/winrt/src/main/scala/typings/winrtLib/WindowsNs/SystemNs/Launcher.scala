package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.System.Launcher")
@js.native
class Launcher () extends js.Object

/* static members */
@JSGlobal("Windows.System.Launcher")
@js.native
object Launcher extends js.Object {
  def launchFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchFileAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    options: winrtLib.WindowsNs.SystemNs.LauncherOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri, options: winrtLib.WindowsNs.SystemNs.LauncherOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
}

