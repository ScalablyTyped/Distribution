package typings.videoDotJs.distAltVideoDotCoreDotNovttMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.videoDotJs.videoDotJsMod.videojs.MenuButton
import typings.videoDotJs.videoDotJsMod.videojs.Player
import typings.videoDotJs.videoDotJsMod.videojs.TrackButtonOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js/dist/alt/video.core.novtt", "TrackButton")
@js.native
class TrackButton protected () extends MenuButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: Player) = this()
  def this(player: Player, options: TrackButtonOptions) = this()
}

/**
  * The base class for buttons that toggle specific  track types (e.g. subtitles).
  */
@JSImport("video.js/dist/alt/video.core.novtt", "TrackButton")
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
Instantiable1[/* player */ Player, MenuButton]
     with Instantiable2[/* player */ Player, /* options */ TrackButtonOptions, MenuButton]

