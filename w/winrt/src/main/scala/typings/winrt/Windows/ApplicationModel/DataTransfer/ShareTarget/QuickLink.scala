package typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QuickLink extends IQuickLink

object QuickLink {
  @scala.inline
  def apply(
    id: String,
    supportedDataFormats: IVector[String],
    supportedFileTypes: IVector[String],
    thumbnail: RandomAccessStreamReference,
    title: String
  ): QuickLink = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], supportedDataFormats = supportedDataFormats.asInstanceOf[js.Any], supportedFileTypes = supportedFileTypes.asInstanceOf[js.Any], thumbnail = thumbnail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuickLink]
  }
}

