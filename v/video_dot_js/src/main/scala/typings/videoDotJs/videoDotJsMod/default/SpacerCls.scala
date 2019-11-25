package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Spacer")
@js.native
class SpacerCls protected ()
  extends typings.videoDotJs.videoDotJsMod.videojs.Spacer {
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
    *        Function that gets called when the `Component` is ready.
    */
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player) = this()
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player, options: ComponentOptions) = this()
  def this(
    player: typings.videoDotJs.videoDotJsMod.videojs.Player,
    options: ComponentOptions,
    ready: ReadyCallback
  ) = this()
}

