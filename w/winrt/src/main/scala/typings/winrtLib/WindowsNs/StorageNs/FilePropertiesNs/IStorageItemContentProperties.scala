package typings
package winrtLib.WindowsNs.StorageNs.FilePropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageItemContentProperties extends IStorageItemExtraProperties {
  def getDocumentPropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[DocumentProperties] = js.native
  def getImagePropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[ImageProperties] = js.native
  def getMusicPropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[MusicProperties] = js.native
  def getVideoPropertiesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[VideoProperties] = js.native
}

