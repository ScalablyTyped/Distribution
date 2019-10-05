package typings.winrt.Windows.System

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
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

