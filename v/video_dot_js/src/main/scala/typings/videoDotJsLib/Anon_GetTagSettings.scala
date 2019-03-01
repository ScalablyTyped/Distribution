package typings
package videoDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetTagSettings
  extends /**
		 * An instance of the `Player` class is created when any of the Video.js setup methods
		 * are used to initialize a video.
		 *
		 * After an instance has been created it can be accessed globally in two ways:
		 * 1. By calling `videojs('example_video_1');`
		 * 2. By using it directly via  `videojs.players.example_video_1;`
		 */
org.scalablytyped.runtime.Instantiable1[
      /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
      videoDotJsLib.videoDotJsMod.videojsNs.Player
    ]
     with org.scalablytyped.runtime.Instantiable2[
      /* player */ videoDotJsLib.videoDotJsMod.videojsNs.Player, 
      /* options */ videoDotJsLib.videoDotJsMod.videojsNs.PlayerOptions, 
      videoDotJsLib.videoDotJsMod.videojsNs.Player
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
  def getTagSettings(tag: stdLib.Element): js.Any = js.native
}

