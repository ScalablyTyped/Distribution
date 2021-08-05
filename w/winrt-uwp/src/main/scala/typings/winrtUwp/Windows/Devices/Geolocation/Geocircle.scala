package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a geographic circle with a center point and a radius. */
trait Geocircle extends StObject {
  
  /** The altitude reference system of the geographic circle. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  
  /** The center point of a geographic circle. */
  var center: BasicGeoposition
  
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  
  /** The radius of a geographic circle in meters. */
  var radius: Double
  
  /** The spatial reference identifier for the geographic circle, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double
}
object Geocircle {
  
  inline def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    center: BasicGeoposition,
    geoshapeType: GeoshapeType,
    radius: Double,
    spatialReferenceId: Double
  ): Geocircle = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geocircle]
  }
  
  extension [Self <: Geocircle](x: Self) {
    
    inline def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = StObject.set(x, "altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    inline def setCenter(value: BasicGeoposition): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    inline def setGeoshapeType(value: GeoshapeType): Self = StObject.set(x, "geoshapeType", value.asInstanceOf[js.Any])
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceId(value: Double): Self = StObject.set(x, "spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
