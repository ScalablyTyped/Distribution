package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

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
  sealed trait clockwise180Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation
  
  /** Rotate 270 degrees clockwise. */
  @js.native
  sealed trait clockwise270Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation
  
  /** Rotate 90 degrees clockwise. */
  @js.native
  sealed trait clockwise90Degrees
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation
  
  /** No rotation. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation
  
  val clockwise180Degrees: clockwise180Degrees with java.lang.String = js.native
  val clockwise270Degrees: clockwise270Degrees with java.lang.String = js.native
  val clockwise90Degrees: clockwise90Degrees with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaRotation with java.lang.String
  ] = js.native
}

