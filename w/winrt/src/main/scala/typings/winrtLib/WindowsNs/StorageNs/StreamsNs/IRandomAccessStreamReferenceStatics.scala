package typings
package winrtLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRandomAccessStreamReferenceStatics extends js.Object {
  def createFromFile(file: winrtLib.WindowsNs.StorageNs.IStorageFile): RandomAccessStreamReference
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference
  def createFromUri(uri: winrtLib.WindowsNs.FoundationNs.Uri): RandomAccessStreamReference
}

