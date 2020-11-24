package typings.videoJs.videoCoreMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.videoJs.mod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core", "TrackButton")
@js.native
class TrackButton protected ()
  extends typings.videoJs.mod.videojs.MenuButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
}
/**
  * The base class for buttons that toggle specific  track types (e.g. subtitles).
  */
@JSImport("video.js/dist/alt/video.core", "TrackButton")
@js.native
object TrackButton
  extends /**
  * Creates an instance of this class.
  *
  * @param player
  *         The `Player` that this class should be attached to.
  *
  * @param [options]
  *         The key/value store of player options.
  */
Instantiable1[
      /* player */ typings.videoJs.mod.videojs.Player, 
      typings.videoJs.mod.videojs.MenuButton
    ]
     with Instantiable2[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ TrackButtonOptions, 
      typings.videoJs.mod.videojs.MenuButton
    ]
