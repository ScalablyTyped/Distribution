package typings.winrtUwp.Windows.Devices.Geolocation

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an ordered series of geographic points. */
trait Geopath extends StObject {
  
  /** Gets the altitude reference system used by the Geopath . */
  var altitudeReferenceSystem: AltitudeReferenceSystem
  
  /** Gets the type of geographic shape represented by the Geopath . */
  var geoshapeType: GeoshapeType
  
  /** Gets the collection of geographic points that define the Geopath . */
  var positions: IVectorView[BasicGeoposition]
  
  /** Gets the spatial reference ID (SRID) used by the Geopath . */
  var spatialReferenceId: Double
}
object Geopath {
  
  @scala.inline
  def apply(
    altitudeReferenceSystem: AltitudeReferenceSystem,
    geoshapeType: GeoshapeType,
    positions: IVectorView[BasicGeoposition],
    spatialReferenceId: Double
  ): Geopath = {
    val __obj = js.Dynamic.literal(altitudeReferenceSystem = altitudeReferenceSystem.asInstanceOf[js.Any], geoshapeType = geoshapeType.asInstanceOf[js.Any], positions = positions.asInstanceOf[js.Any], spatialReferenceId = spatialReferenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geopath]
  }
  
  @scala.inline
  implicit class GeopathMutableBuilder[Self <: Geopath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitudeReferenceSystem(value: AltitudeReferenceSystem): Self = StObject.set(x, "altitudeReferenceSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeType(value: GeoshapeType): Self = StObject.set(x, "geoshapeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositions(value: IVectorView[BasicGeoposition]): Self = StObject.set(x, "positions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceId(value: Double): Self = StObject.set(x, "spatialReferenceId", value.asInstanceOf[js.Any])
  }
}
