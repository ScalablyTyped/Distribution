package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.Slider
import typings.videoDotJs.videoDotJsMod.videojs.SliderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Slider")
@js.native
class SliderCls protected () extends Slider {
  /**
    * Create an instance of this class
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: Player) = this()
  def this(player: Player, options: SliderOptions) = this()
}

