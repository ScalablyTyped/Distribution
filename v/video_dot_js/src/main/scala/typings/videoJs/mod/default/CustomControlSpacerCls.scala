package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.ComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CustomControlSpacer")
@js.native
class CustomControlSpacerCls protected ()
  extends typings.videoJs.mod.videojs.CustomControlSpacer {
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
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions) = this()
  def this(
    player: typings.videoJs.mod.videojs.Player,
    options: js.UndefOr[scala.Nothing],
    ready: ReadyCallback
  ) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: ComponentOptions, ready: ReadyCallback) = this()
}

