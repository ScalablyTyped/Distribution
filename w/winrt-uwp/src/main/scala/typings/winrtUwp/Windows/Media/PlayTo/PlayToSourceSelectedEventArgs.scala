package typings.winrtUwp.Windows.Media.PlayTo

import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the SourceSelected event. */
trait PlayToSourceSelectedEventArgs extends js.Object {
  /** Gets the display name of the selected Play To source. */
  var friendlyName: String
  /** Gets the display icon for the selected Play To source. */
  var icon: IRandomAccessStreamWithContentType
  /** Gets a value that indicates whether the selected Play To source supports audio. */
  var supportsAudio: Boolean
  /** Gets a value that indicates whether the selected Play To source supports displaying images. */
  var supportsImage: Boolean
  /** Gets a value that indicates whether the selected Play To source supports video. */
  var supportsVideo: Boolean
}

object PlayToSourceSelectedEventArgs {
  @scala.inline
  def apply(
    friendlyName: String,
    icon: IRandomAccessStreamWithContentType,
    supportsAudio: Boolean,
    supportsImage: Boolean,
    supportsVideo: Boolean
  ): PlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal(friendlyName = friendlyName.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], supportsAudio = supportsAudio.asInstanceOf[js.Any], supportsImage = supportsImage.asInstanceOf[js.Any], supportsVideo = supportsVideo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayToSourceSelectedEventArgs]
  }
}

