package typings.videoDotJs.videoDotJsMod.default

import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "Player")
@js.native
class PlayerCls protected () extends Player {
  /**
    * An instance of the `Player` class is created when any of the Video.js setup methods
    * are used to initialize a video.
    *
    * After an instance has been created it can be accessed globally in two ways:
    * 1. By calling `videojs('example_video_1');`
    * 2. By using it directly via  `videojs.players.example_video_1;`
    */
  def this(player: Player) = this()
  def this(player: Player, options: PlayerOptions) = this()
}

