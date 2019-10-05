package typings.winrt.Windows.Storage.FileProperties

import typings.winrt.Windows.Foundation.IAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemContentProperties extends IStorageItemExtraProperties {
  def getDocumentPropertiesAsync(): IAsyncOperation[DocumentProperties] = js.native
  def getImagePropertiesAsync(): IAsyncOperation[ImageProperties] = js.native
  def getMusicPropertiesAsync(): IAsyncOperation[MusicProperties] = js.native
  def getVideoPropertiesAsync(): IAsyncOperation[VideoProperties] = js.native
}

