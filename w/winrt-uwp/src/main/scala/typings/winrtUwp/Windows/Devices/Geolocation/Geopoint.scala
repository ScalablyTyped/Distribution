package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes a geographic point. */
trait Geopoint extends StObject {
  
  /** The altitude reference system of the geographic point. */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  
  /** The type of geographic shape. */
  var geoshapeType: GeoshapeType
  
  /** The position of a geographic point. */
  var position: BasicGeoposition
  
  /** The spatial reference identifier for the geographic point, corresponding to a spatial reference system based on the specific ellipsoid used for either flat-earth mapping or round-earth mapping. */
  var spatialReferenceId: Double
}
object Geopoint {
  
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    position: BasicGeoposition,
    spatialReferenceId: Double
  ): Geopoint = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geopoint]
  }
  
  @scala.inline
  implicit class GeopointMutableBuilder[Self <: Geopoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = StObject.set(x, "altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = StObject.set(x, "geoshapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: BasicGeoposition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = StObject.set(x, "spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
