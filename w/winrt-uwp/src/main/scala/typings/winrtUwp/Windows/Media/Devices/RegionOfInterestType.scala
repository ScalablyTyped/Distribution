package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait RegionOfInterestType extends StObject
/** Defines the different types of regions of interest that can be detected the capture device. */
@JSGlobal("Windows.Media.Devices.RegionOfInterestType")
@js.native
object RegionOfInterestType extends StObject {
  
  /** The region of interest is a detected face. */
  @js.native
  sealed trait face
    extends StObject
       with RegionOfInterestType
  
  /** The type of region of interest is unknown. */
  @js.native
  sealed trait unknown
    extends StObject
       with RegionOfInterestType
}
