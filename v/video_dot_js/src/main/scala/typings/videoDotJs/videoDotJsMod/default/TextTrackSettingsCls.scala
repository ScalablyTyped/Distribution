package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.TextTrackSettings
import typings.videoDotJs.videoDotJsMod.videojs.TextTrackSettingsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "TextTrackSettings")
@js.native
class TextTrackSettingsCls protected () extends TextTrackSettings {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: Player, options: TextTrackSettingsOptions) = this()
}

