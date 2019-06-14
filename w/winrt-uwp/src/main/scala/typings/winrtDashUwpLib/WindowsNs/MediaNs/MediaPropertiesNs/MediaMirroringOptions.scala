package typings
package winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MediaMirroringOptions extends js.Object

/** Defines the direction in of a mirror transform. */
@JSGlobal("Windows.Media.MediaProperties.MediaMirroringOptions")
@js.native
object MediaMirroringOptions extends js.Object {
  /** Mirror horizontally. */
  @js.native
  sealed trait horizontal
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaMirroringOptions
  
  /** No mirroring. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaMirroringOptions
  
  /** Mirror vertically. */
  @js.native
  sealed trait vertical
    extends winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaMirroringOptions
  
  /* 1 */ val horizontal: horizontal with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val vertical: vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.MediaPropertiesNs.MediaMirroringOptions with scala.Double
  ] = js.native
}

