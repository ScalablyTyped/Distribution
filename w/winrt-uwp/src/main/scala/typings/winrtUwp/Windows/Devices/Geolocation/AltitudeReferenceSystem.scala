package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AltitudeReferenceSystem extends StObject
/** Indicates the altitude reference system to be used in defining a geographic shape. */
@JSGlobal("Windows.Devices.Geolocation.AltitudeReferenceSystem")
@js.native
object AltitudeReferenceSystem extends StObject {
  
  /** The altitude reference system is based on an ellipsoid which is a mathematical approximation of the shape of the Earth. */
  @js.native
  sealed trait ellipsoid
    extends StObject
       with AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above sea level. */
  @js.native
  sealed trait geoid
    extends StObject
       with AltitudeReferenceSystem
  
  /** The altitude reference system is based on the distance above the tallest surface structures, such as buildings, trees, roads, etc., above terrain or ground level. */
  @js.native
  sealed trait surface
    extends StObject
       with AltitudeReferenceSystem
  
  /** The altitude reference system is based on distance above terrain or ground level. */
  @js.native
  sealed trait terrain
    extends StObject
       with AltitudeReferenceSystem
  
  /** The altitude reference system was not specified. */
  @js.native
  sealed trait unspecified
    extends StObject
       with AltitudeReferenceSystem
}
