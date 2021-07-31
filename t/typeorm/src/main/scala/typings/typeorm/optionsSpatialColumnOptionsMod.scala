package typings.typeorm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsSpatialColumnOptionsMod {
  
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
    
    @scala.inline
    def apply(): SpatialColumnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpatialColumnOptions]
    }
    
    @scala.inline
    implicit class SpatialColumnOptionsMutableBuilder[Self <: SpatialColumnOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSpatialFeatureType(value: String): Self = StObject.set(x, "spatialFeatureType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpatialFeatureTypeUndefined: Self = StObject.set(x, "spatialFeatureType", js.undefined)
      
      @scala.inline
      def setSrid(value: Double): Self = StObject.set(x, "srid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSridUndefined: Self = StObject.set(x, "srid", js.undefined)
    }
  }
}
