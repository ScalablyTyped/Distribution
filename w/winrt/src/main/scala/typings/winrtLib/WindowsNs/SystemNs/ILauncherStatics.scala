package typings
package winrtLib.WindowsNs.SystemNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILauncherStatics extends js.Object {
  def launchFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchFileAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile, options: LauncherOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
  def launchUriAsync(uri: winrtLib.WindowsNs.FoundationNs.Uri, options: LauncherOptions): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[scala.Boolean] = js.native
}

