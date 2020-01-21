package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.ControlBarOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "ControlBar")
@js.native
class ControlBarCls protected ()
  extends typings.videoJs.mod.videojs.ControlBar {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ControlBarOptions) = this()
}

