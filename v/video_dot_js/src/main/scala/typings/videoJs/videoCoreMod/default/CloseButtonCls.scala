package typings.videoJs.videoCoreMod.default

import typings.videoJs.mod.videojs.CloseButton
import typings.videoJs.mod.videojs.CloseButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/alt/video.core", "default.CloseButton")
@js.native
class CloseButtonCls protected ()
  extends StObject
     with CloseButton {
  /**
    * Creates an instance of the this class.
    *
    * @param player
    *         The `Player` that this class should be attached to.
    *
    * @param [options]
    *         The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: CloseButtonOptions) = this()
}
