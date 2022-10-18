package typings.videoJs.distAltVideoDotcoreDotnovttMod.default

import typings.videoJs.mod.videojs.VolumeControl
import typings.videoJs.mod.videojs.VolumeControlOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/alt/video.core.novtt", "default.VolumeControl")
@js.native
open class VolumeControlCls protected ()
  extends StObject
     with VolumeControl {
  /**
    * Creates an instance of this class.
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options={}]
    *        The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: VolumeControlOptions) = this()
}
