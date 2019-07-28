package typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs

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
  
  /* 2 */ val clockwise180Degrees: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation.clockwise180Degrees with Double = js.native
  /* 3 */ val clockwise270Degrees: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation.clockwise270Degrees with Double = js.native
  /* 1 */ val clockwise90Degrees: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation.clockwise90Degrees with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MediaRotation with Double] = js.native
}

