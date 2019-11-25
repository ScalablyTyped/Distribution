package typings.winrt.Windows.Media.PlayTo

import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamWithContentType
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
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlayToSourceSelectedEventArgs]
  }
}

