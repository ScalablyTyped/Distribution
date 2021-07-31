package typings.videoJs.mod.default

import typings.videoJs.mod.videojs.CaptionSettingsMenuItem
import typings.videoJs.mod.videojs.CaptionSettingsMenuItemOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("video.js", "default.CaptionsSettingsMenuItem")
@js.native
class CaptionsSettingsMenuItem protected ()
  extends StObject
     with CaptionSettingsMenuItem {
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
