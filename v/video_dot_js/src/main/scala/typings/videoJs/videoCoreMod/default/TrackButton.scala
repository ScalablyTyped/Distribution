package typings.videoJs.videoCoreMod.default

import typings.videoJs.mod.videojs.MenuButton
import typings.videoJs.mod.videojs.TrackButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("video.js/dist/alt/video.core", "default.TrackButton")
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
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
}
/**
  * The base class for buttons that toggle specific  track types (e.g. subtitles).
  */
object TrackButton
