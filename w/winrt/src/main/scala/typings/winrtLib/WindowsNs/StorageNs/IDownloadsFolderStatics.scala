package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDownloadsFolderStatics extends js.Object {
  def createFileAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: java.lang.String, option: CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def createFolderAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: java.lang.String, option: CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder] = js.native
}

