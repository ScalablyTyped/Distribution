package typings
package winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RegionOfInterestType extends js.Object

/** Defines the different types of regions of interest that can be detected the capture device. */
@JSGlobal("Windows.Media.Devices.RegionOfInterestType")
@js.native
object RegionOfInterestType extends js.Object {
  /** The region of interest is a detected face. */
  @js.native
  sealed trait face
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.RegionOfInterestType
  
  /** The type of region of interest is unknown. */
  @js.native
  sealed trait unknown
    extends winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.RegionOfInterestType
  
  /* 1 */ val face: face with scala.Double = js.native
  /* 0 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.RegionOfInterestType with scala.Double
  ] = js.native
}

