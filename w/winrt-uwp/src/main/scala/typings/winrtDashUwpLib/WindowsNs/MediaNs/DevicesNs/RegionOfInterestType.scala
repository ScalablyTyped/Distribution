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
  
  val face: face with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.MediaNs.DevicesNs.RegionOfInterestType with java.lang.String
  ] = js.native
}

