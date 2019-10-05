package typings.winrtDashUwp.Windows.Media.Devices

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
  sealed trait face extends RegionOfInterestType
  
  /** The type of region of interest is unknown. */
  @js.native
  sealed trait unknown extends RegionOfInterestType
  
  /* 1 */ val face: typings.winrtDashUwp.Windows.Media.Devices.RegionOfInterestType.face with Double = js.native
  /* 0 */ val unknown: typings.winrtDashUwp.Windows.Media.Devices.RegionOfInterestType.unknown with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RegionOfInterestType with Double] = js.native
}

