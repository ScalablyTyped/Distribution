package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.MenuOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("video.js", "Menu")
@js.native
class MenuCls protected ()
  extends typings.videoJs.mod.videojs.Menu {
  /**
    * Create an instance of this class.
    *
    * @param player
    *        the player that this component should attach to
    *
    * @param [options]
    *        Object of option names and values
    *
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: MenuOptions) = this()
}
