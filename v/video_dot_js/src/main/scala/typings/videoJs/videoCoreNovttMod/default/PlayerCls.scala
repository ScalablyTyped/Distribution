package typings.videoJs.videoCoreNovttMod.default

import typings.videoJs.mod.VideoJsPlayer
import typings.videoJs.mod.videojs.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "Player")
@js.native
class PlayerCls protected () extends VideoJsPlayer {
  /**
    * An instance of the `Player` class is created when any of the Video.js setup methods
    * are used to initialize a video.
    *
    * After an instance has been created it can be accessed globally in two ways:
    * 1. By calling `videojs('example_video_1');`
    * 2. By using it directly via  `videojs.players.example_video_1;`
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: PlayerOptions) = this()
}

