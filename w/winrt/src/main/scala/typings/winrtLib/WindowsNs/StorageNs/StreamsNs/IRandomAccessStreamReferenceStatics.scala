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
    createFromFile: js.Function1[winrtLib.WindowsNs.StorageNs.IStorageFile, RandomAccessStreamReference],
    createFromStream: js.Function1[IRandomAccessStream, RandomAccessStreamReference],
    createFromUri: js.Function1[winrtLib.WindowsNs.FoundationNs.Uri, RandomAccessStreamReference]
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFromFile")(createFromFile)
    __obj.updateDynamic("createFromStream")(createFromStream)
    __obj.updateDynamic("createFromUri")(createFromUri)
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
}

