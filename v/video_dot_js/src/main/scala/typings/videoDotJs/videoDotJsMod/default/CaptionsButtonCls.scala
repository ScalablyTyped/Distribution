package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.CaptionsButton
import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CaptionsButton")
@js.native
class CaptionsButtonCls protected () extends CaptionsButton {
  /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [ready]
  		 *        The function to call when this function is ready.
  		 */
  def this(player: Player) = this()
  def this(player: Player, options: TrackButtonOptions) = this()
  def this(player: Player, options: TrackButtonOptions, ready: ReadyCallback) = this()
}

