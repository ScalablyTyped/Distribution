package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.VolumeLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "VolumeLevel")
@js.native
class VolumeLevelCls protected () extends VolumeLevel {
  /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 *
  		 * @param [options.children]
  		 *        An array of children objects to intialize this component with. Children objects have
  		 *        a name property that will be used if more than one component of the same type needs to be
  		 *        added.
  		 *
  		 * @param [ready]
  		 *        Function that gets called when the `Component` is ready.
  		 */
  def this(player: Player) = this()
  def this(player: Player, options: ComponentOptions) = this()
  def this(player: Player, options: ComponentOptions, ready: ReadyCallback) = this()
}

