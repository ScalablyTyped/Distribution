package typings.videoDotJs.videoDotJsMod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrackButtonOptions extends MenuButtonOptions {
  var track: js.Array[Track]
}

object TrackButtonOptions {
  @scala.inline
  def apply(
    track: js.Array[Track],
    children: js.Array[Child] = null,
    iniChildren: js.UndefOr[Boolean] = js.undefined,
    title: String = null
  ): TrackButtonOptions = {
    val __obj = js.Dynamic.literal(track = track.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(iniChildren)) __obj.updateDynamic("iniChildren")(iniChildren.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackButtonOptions]
  }
}

