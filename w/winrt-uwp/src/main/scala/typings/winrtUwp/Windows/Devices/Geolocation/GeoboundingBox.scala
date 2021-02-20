package typings.winrtUwp.Windows.Devices.Geolocation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a rectangle that defines a geographic area. */
@js.native
trait GeoboundingBox extends StObject {
  
  /** Gets the altitude reference system used by the GeoboundingBox . */
  var altitudeReferenceSystem: AltitudeReferenceSystem = js.native
  
  /** Gets the center of the GeoboundingBox . */
  var center: BasicGeoposition = js.native
  
  /** Gets the type of geographic shape represented by the GeoboundingBox . */
  var geoshapeType: GeoshapeType = js.native
  
  /** Gets the altitude of the highest corner of the GeoboundingBox . */
  var maxAltitude: Double = js.native
  
  /** Gets the altitude of the lowest corner of the GeoboundingBox . */
  var minAltitude: Double = js.native
  
  /** Gets the northwest corner of the GeoboundingBox . */
  var northwestCorner: BasicGeoposition = js.native
  
  /** Gets the southeast corner of the GeoboundingBox . */
  var southeastCorner: BasicGeoposition = js.native
  
  /** Gets the spatial reference ID (SRID) used by the GeoboundingBox . */
  var spatialReferenceId: Double = js.native
}
object GeoboundingBox {
  
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    center: BasicGeoposition,
    geoshapeType: GeoshapeType,
    maxAltitude: Double,
    minAltitude: Double,
    northwestCorner: BasicGeoposition,
    southeastCorner: BasicGeoposition,
    spatialReferenceId: Double
  ): GeoboundingBox = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], center = center.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], maxAltitude = maxAltitude.asInstanceOf[js.Any], minAltitude = minAltitude.asInstanceOf[js.Any], northwestCorner = northwestCorner.asInstanceOf[js.Any], southeastCorner = southeastCorner.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeoboundingBox]
  }
  
  @scala.inline
  implicit class GeoboundingBoxMutableBuilder[Self <: GeoboundingBox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = StObject.set(x, "altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenter(value: BasicGeoposition): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = StObject.set(x, "geoshapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAltitude(value: Double): Self = StObject.set(x, "maxAltitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinAltitude(value: Double): Self = StObject.set(x, "minAltitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorthwestCorner(value: BasicGeoposition): Self = StObject.set(x, "northwestCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoutheastCorner(value: BasicGeoposition): Self = StObject.set(x, "southeastCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = StObject.set(x, "spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
