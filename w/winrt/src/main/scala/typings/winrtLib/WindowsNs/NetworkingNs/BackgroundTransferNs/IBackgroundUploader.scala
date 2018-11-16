package typings
package winrtLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IBackgroundUploader extends IBackgroundTransferBase {
  def createUpload(uri: winrtLib.WindowsNs.FoundationNs.Uri, sourceFile: winrtLib.WindowsNs.StorageNs.IStorageFile): UploadOperation = js.native
  def createUploadAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    parts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BackgroundTransferContentPart]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    parts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BackgroundTransferContentPart],
    subType: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UploadOperation] = js.native
  def createUploadAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    parts: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[BackgroundTransferContentPart],
    subType: java.lang.String,
    boundary: java.lang.String
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UploadOperation] = js.native
  def createUploadFromStreamAsync(
    uri: winrtLib.WindowsNs.FoundationNs.Uri,
    sourceStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[UploadOperation] = js.native
}

