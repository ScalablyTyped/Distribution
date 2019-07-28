package typings.winrt.WindowsNs.MediaNs.PlayToNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceSelectedEventArgs extends js.Object {
  var friendlyName: String
  var icon: IRandomAccessStreamWithContentType
  var supportsAudio: Boolean
  var supportsImage: Boolean
  var supportsVideo: Boolean
}

object IPlayToSourceSelectedEventArgs {
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): IPlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName, icon = icon, supportsAudio = supportsAudio, supportsImage = supportsImage, supportsVideo = supportsVideo)
  
    __obj.asInstanceOf[IPlayToSourceSelectedEventArgs]
  }
}

