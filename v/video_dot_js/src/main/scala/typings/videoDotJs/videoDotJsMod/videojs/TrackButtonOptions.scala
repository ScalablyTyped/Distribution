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
    val __obj = js.Dynamic.literal(track = track)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(iniChildren)) __obj.updateDynamic("iniChildren")(iniChildren)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[TrackButtonOptions]
  }
}

