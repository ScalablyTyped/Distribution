package typings.videoJs.videoCoreMod.default

import typings.videoJs.mod.videojs.ChaptersButton
import typings.videoJs.mod.videojs.Component.ReadyCallback
import typings.videoJs.mod.videojs.TrackButtonOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/alt/video.core", "default.ChaptersButton")
@js.native
open class ChaptersButtonCls protected ()
  extends StObject
     with ChaptersButton {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    *
    * @param [ready]
    *        The function to call when this function is ready.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: Unit, ready: ReadyCallback) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: TrackButtonOptions, ready: ReadyCallback) = this()
}
