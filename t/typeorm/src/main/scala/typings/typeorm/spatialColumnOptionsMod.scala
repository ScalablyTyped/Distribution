package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spatialColumnOptionsMod {
  
  trait SpatialColumnOptions extends StObject {
    
    /**
      * Column type's feature type.
      * Geometry, Point, Polygon, etc.
      */
    var spatialFeatureType: js.UndefOr[String] = js.undefined
    
    /**
      * Column type's SRID.
      * Spatial Reference ID or EPSG code.
      */
    var srid: js.UndefOr[Double] = js.undefined
  }
  object SpatialColumnOptions {
    
    inline def apply(): SpatialColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpatialColumnOptions]
    }
    
    extension [Self <: SpatialColumnOptions](x: Self) {
      
      inline def setSpatialFeatureType(value: String): Self = StObject.set(x, "spatialFeatureType", value.asInstanceOf[js.Any])
      
      inline def setSpatialFeatureTypeUndefined: Self = StObject.set(x, "spatialFeatureType", js.undefined)
      
      inline def setSrid(value: Double): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      inline def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
    }
  }
}
