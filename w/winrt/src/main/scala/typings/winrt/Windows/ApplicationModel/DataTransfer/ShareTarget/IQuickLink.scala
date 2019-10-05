package typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IQuickLink extends js.Object {
  var id: String
  var supportedDataFormats: IVector[String]
  var supportedFileTypes: IVector[String]
  var thumbnail: RandomAccessStreamReference
  var title: String
}

object IQuickLink {
  @scala.inline
  def apply(
    id: String,
    supportedDataFormats: IVector[String],
    supportedFileTypes: IVector[String],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): IQuickLink = {
    val __obj = js.Dynamic.literal(id = id, supportedDataFormats = supportedDataFormats, supportedFileTypes = supportedFileTypes, thumbnail = thumbnail, title = title)
  
    __obj.asInstanceOf[IQuickLink]
  }
}

