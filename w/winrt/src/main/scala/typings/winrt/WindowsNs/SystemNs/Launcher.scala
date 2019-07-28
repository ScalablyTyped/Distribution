package typings.winrt.WindowsNs.SystemNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageFile
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
  def launchFileAsync(file: IStorageFile): IAsyncOperation[Boolean] = js.native
  def launchFileAsync(file: IStorageFile, options: LauncherOptions): IAsyncOperation[Boolean] = js.native
  def launchUriAsync(uri: Uri): IAsyncOperation[Boolean] = js.native
  def launchUriAsync(uri: Uri, options: LauncherOptions): IAsyncOperation[Boolean] = js.native
}

