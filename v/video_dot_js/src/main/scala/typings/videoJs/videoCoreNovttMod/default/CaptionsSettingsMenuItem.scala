package typings.videoJs.videoCoreNovttMod.default

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.videoJs.mod.videojs.CaptionSettingsMenuItem
import typings.videoJs.mod.videojs.CaptionSettingsMenuItemOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js/dist/alt/video.core.novtt", "CaptionsSettingsMenuItem")
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
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: CaptionSettingsMenuItemOptions) = this()
}
@JSImport("video.js/dist/alt/video.core.novtt", "CaptionsSettingsMenuItem")
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
Instantiable1[/* player */ typings.videoJs.mod.videojs.Player, CaptionSettingsMenuItem]
     with Instantiable2[
      /* player */ typings.videoJs.mod.videojs.Player, 
      /* options */ CaptionSettingsMenuItemOptions, 
      CaptionSettingsMenuItem
    ]
