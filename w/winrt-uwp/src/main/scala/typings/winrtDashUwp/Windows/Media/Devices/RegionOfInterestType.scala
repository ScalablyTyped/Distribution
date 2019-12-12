package typings.winrtDashUwp.Windows.Media.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Media.Devices.RegionOfInterestType.face
import typings.winrtDashUwp.Windows.Media.Devices.RegionOfInterestType.unknown
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RegionOfInterestType with Double] = js.native
  /* 1 */ @js.native
  object face extends TopLevel[face with Double]
  
  /* 0 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

