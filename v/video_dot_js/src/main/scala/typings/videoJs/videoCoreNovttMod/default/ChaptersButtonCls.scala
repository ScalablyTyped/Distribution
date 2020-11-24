package typings.videoJs.videoCoreNovttMod.default

import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "ChaptersButton")
@js.native
class ChaptersButtonCls protected ()
  extends typings.videoJs.mod.videojs.ChaptersButton {
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
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
  def this(
    player: typings.videoJs.mod.videojs.Player,
    options: js.UndefOr[scala.Nothing],
    ready: ReadyCallback
  ) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions, ready: ReadyCallback) = this()
}
