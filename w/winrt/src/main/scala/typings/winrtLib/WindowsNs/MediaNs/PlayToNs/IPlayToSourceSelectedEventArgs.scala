package typings
package winrtLib.WindowsNs.MediaNs.PlayToNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlayToSourceSelectedEventArgs extends js.Object {
  var friendlyName: java.lang.String
  var icon: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType
  var supportsAudio: scala.Boolean
  var supportsImage: scala.Boolean
  var supportsVideo: scala.Boolean
}

object IPlayToSourceSelectedEventArgs {
  @scala.inline
  def apply(
    friendlyName: java.lang.String,
    icon: winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamWithContentType,
    supportsAudio: scala.Boolean,
    supportsImage: scala.Boolean,
    supportsVideo: scala.Boolean
  ): IPlayToSourceSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("friendlyName")(friendlyName)
    __obj.updateDynamic("icon")(icon)
    __obj.updateDynamic("supportsAudio")(supportsAudio)
    __obj.updateDynamic("supportsImage")(supportsImage)
    __obj.updateDynamic("supportsVideo")(supportsVideo)
    __obj.asInstanceOf[IPlayToSourceSelectedEventArgs]
  }
}

