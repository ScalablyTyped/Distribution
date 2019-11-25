package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Component.ReadyCallback
import typings.videoDotJs.videoDotJsMod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "DescriptionsButton")
@js.native
class DescriptionsButtonCls protected ()
  extends typings.videoDotJs.videoDotJsMod.videojs.DescriptionsButton {
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
    *        The function to call when this component is ready.
    */
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player) = this()
  def this(player: typings.videoDotJs.videoDotJsMod.videojs.Player, options: TrackButtonOptions) = this()
  def this(
    player: typings.videoDotJs.videoDotJsMod.videojs.Player,
    options: TrackButtonOptions,
    ready: ReadyCallback
  ) = this()
}

