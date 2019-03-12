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

object IRandomAccessStreamReferenceStatics {
  @scala.inline
  def apply(
    createFromFile: winrtLib.WindowsNs.StorageNs.IStorageFile => RandomAccessStreamReference,
    createFromStream: IRandomAccessStream => RandomAccessStreamReference,
    createFromUri: winrtLib.WindowsNs.FoundationNs.Uri => RandomAccessStreamReference
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal(createFromFile = js.Any.fromFunction1(createFromFile), createFromStream = js.Any.fromFunction1(createFromStream), createFromUri = js.Any.fromFunction1(createFromUri))
  
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
}

