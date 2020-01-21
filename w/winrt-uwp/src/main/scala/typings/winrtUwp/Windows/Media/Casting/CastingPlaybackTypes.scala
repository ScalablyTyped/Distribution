package typings.winrtUwp.Windows.Media.Casting

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CastingPlaybackTypes extends js.Object

/** Indicates the capabilities of a particular casting device. */
@JSGlobal("Windows.Media.Casting.CastingPlaybackTypes")
@js.native
object CastingPlaybackTypes extends js.Object {
  /** The casting device supports audio playback. */
  @js.native
  sealed trait audio extends CastingPlaybackTypes
  
  /** The casting device does not support playback. */
  @js.native
  sealed trait none extends CastingPlaybackTypes
  
  /** The casting device supports image playback. */
  @js.native
  sealed trait picture extends CastingPlaybackTypes
  
  /** The casting device supports video playback. */
  @js.native
  sealed trait video extends CastingPlaybackTypes
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CastingPlaybackTypes with Double] = js.native
  /* 1 */ @js.native
  object audio extends TopLevel[audio with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object picture extends TopLevel[picture with Double]
  
  /* 2 */ @js.native
  object video extends TopLevel[video with Double]
  
}

