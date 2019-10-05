package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.TimeDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "TimeDisplay")
@js.native
class TimeDisplayCls protected () extends TimeDisplay {
  /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  def this(player: Player) = this()
  def this(player: Player, options: ComponentOptions) = this()
}

