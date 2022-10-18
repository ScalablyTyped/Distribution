package typings.videoJs.distAltVideoDotcoreMod.default

import typings.videoJs.mod.videojs.Slider
import typings.videoJs.mod.videojs.SliderOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("video.js/dist/alt/video.core", "default.Slider")
@js.native
open class SliderCls protected ()
  extends StObject
     with Slider {
  /**
    * Create an instance of this class
    *
    * @param player
    *        The `Player` that this class should be attached to.
    *
    * @param [options]
    *        The key/value store of player options.
    */
  def this(player: typings.videoJs.mod.videojs.Player) = this()
  def this(player: typings.videoJs.mod.videojs.Player, options: SliderOptions) = this()
}
