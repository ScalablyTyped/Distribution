package typings.videoJs.distAltVideoDotcoreMod.default

import typings.std.Element
import typings.videoJs.mod.VideoJsPlayer
import typings.videoJs.mod.videojs.PlayerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Player {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("video.js/dist/alt/video.core", "default.Player")
  @js.native
  open class ^ protected ()
    extends StObject
       with VideoJsPlayer {
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
  
  @JSImport("video.js/dist/alt/video.core", "default.Player")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets tag settings
    *
    * @param tag
    *        The player tag
    * @check
    * @return An object containing all of the settings
    *         for a player tag
    */
  inline def getTagSettings(tag: Element): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getTagSettings")(tag.asInstanceOf[js.Any]).asInstanceOf[Any]
}
