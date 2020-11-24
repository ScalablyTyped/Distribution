package typings.videoJs.videoCoreMod.default.Player

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.std.Element
import typings.videoJs.mod.VideoJsPlayer
import typings.videoJs.mod.videojs.PlayerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core", "Player")
@js.native
class ^ protected () extends VideoJsPlayer {
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
@JSImport("video.js/dist/alt/video.core", "Player")
@js.native
object ^
  extends TopLevel[
      (/**
  * An instance of the `Player` class is created when any of the Video.js setup methods
  * are used to initialize a video.
  *
  * After an instance has been created it can be accessed globally in two ways:
  * 1. By calling `videojs('example_video_1');`
  * 2. By using it directly via  `videojs.players.example_video_1;`
  */
Instantiable1[
        /* player */ typings.videoJs.mod.videojs.Player, 
        typings.videoJs.mod.videojs.Player
      ]) with (Instantiable2[
        /* player */ typings.videoJs.mod.videojs.Player, 
        /* options */ PlayerOptions, 
        typings.videoJs.mod.videojs.Player
      ])
    ] {
  
  /**
    * Gets tag settings
    *
    * @param tag
    *        The player tag
    * @check
    * @return An object containing all of the settings
    *         for a player tag
    */
  def getTagSettings(tag: Element): js.Any = js.native
}
