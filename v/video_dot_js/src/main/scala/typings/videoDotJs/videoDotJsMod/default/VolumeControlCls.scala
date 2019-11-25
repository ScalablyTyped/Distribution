package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.VolumeControlOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "VolumeControl")
@js.native
class VolumeControlCls protected ()
  extends typings.videoDotJs.videoDotJsMod.videojs.VolumeControl {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    */
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player) = this()
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player, options: VolumeControlOptions) = this()
}

