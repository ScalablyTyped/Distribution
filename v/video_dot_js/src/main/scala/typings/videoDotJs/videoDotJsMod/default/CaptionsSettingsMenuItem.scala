package typings.videoDotJs.videoDotJsMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.videoDotJs.videoDotJsMod.videojs.CaptionSettingsMenuItem
import typings.videoDotJs.videoDotJsMod.videojs.CaptionSettingsMenuItemOptions
import typings.videoDotJs.videoDotJsMod.videojs.Player
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("video.js", "CaptionsSettingsMenuItem")
@js.native
class CaptionsSettingsMenuItem protected () extends CaptionSettingsMenuItem {
  /**
  		 * Creates an instance of this class.
  		 *
  		 * @param player
  		 *        The `Player` that this class should be attached to.
  		 *
  		 * @param [options]
  		 *        The key/value store of player options.
  		 */
  def this(player: Player) = this()
  def this(player: Player, options: CaptionSettingsMenuItemOptions) = this()
}

@JSImport("video.js", "CaptionsSettingsMenuItem")
@js.native
object CaptionsSettingsMenuItem
  extends /**
		 * Creates an instance of this class.
		 *
		 * @param player
		 *        The `Player` that this class should be attached to.
		 *
		 * @param [options]
		 *        The key/value store of player options.
		 */
Instantiable1[/* player */ Player, CaptionSettingsMenuItem]
     with Instantiable2[
      /* player */ Player, 
      /* options */ CaptionSettingsMenuItemOptions, 
      CaptionSettingsMenuItem
    ]

