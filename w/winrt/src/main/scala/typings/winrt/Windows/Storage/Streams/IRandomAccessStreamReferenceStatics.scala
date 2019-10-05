package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRandomAccessStreamReferenceStatics extends js.Object {
  def createFromFile(file: IStorageFile): RandomAccessStreamReference
  def createFromStream(stream: IRandomAccessStream): RandomAccessStreamReference
  def createFromUri(uri: Uri): RandomAccessStreamReference
}

object IRandomAccessStreamReferenceStatics {
  @scala.inline
  def apply(
    createFromFile: IStorageFile => RandomAccessStreamReference,
    createFromStream: IRandomAccessStream => RandomAccessStreamReference,
    createFromUri: Uri => RandomAccessStreamReference
  ): IRandomAccessStreamReferenceStatics = {
    val __obj = js.Dynamic.literal(createFromFile = js.Any.fromFunction1(createFromFile), createFromStream = js.Any.fromFunction1(createFromStream), createFromUri = js.Any.fromFunction1(createFromUri))
  
    __obj.asInstanceOf[IRandomAccessStreamReferenceStatics]
  }
}

