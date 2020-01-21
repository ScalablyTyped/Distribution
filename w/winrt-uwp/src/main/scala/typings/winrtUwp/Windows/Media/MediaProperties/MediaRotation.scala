package typings.winrtUwp.Windows.Media.MediaProperties

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaRotation extends js.Object

/** Defines the direction and angle of a media rotation transform. */
@JSGlobal("Windows.Media.MediaProperties.MediaRotation")
@js.native
object MediaRotation extends js.Object {
  /** Rotate 180 degrees clockwise. */
  @js.native
  sealed trait clockwise180Degrees extends MediaRotation
  
  /** Rotate 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees extends MediaRotation
  
  /** Rotate 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees extends MediaRotation
  
  /** No rotation. */
  @js.native
  sealed trait none extends MediaRotation
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaRotation with Double] = js.native
  /* 2 */ @js.native
  object clockwise180Degrees extends TopLevel[clockwise180Degrees with Double]
  
  /* 3 */ @js.native
  object clockwise270Degrees extends TopLevel[clockwise270Degrees with Double]
  
  /* 1 */ @js.native
  object clockwise90Degrees extends TopLevel[clockwise90Degrees with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

