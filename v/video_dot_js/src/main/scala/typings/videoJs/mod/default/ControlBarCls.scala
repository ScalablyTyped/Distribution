package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.ControlBar
import typings.videoJs.mod.videojs.ControlBarOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js", "default.ControlBar")
@js.native
open class ControlBarCls protected ()
  extends StObject
     with ControlBar {
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
  def this(player: typings.videoJs.mod.videojs.Player, options: ControlBarOptions) = this()
}
