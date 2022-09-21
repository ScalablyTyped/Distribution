package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.geojsonMod.Feature
import typings.trimblemapsTrimblemapsJs.geojsonMod.FeatureCollection
import typings.trimblemapsTrimblemapsJs.geojsonMod.GeoJsonProperties
import typings.trimblemapsTrimblemapsJs.geojsonMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoJSONSourceOptions extends StObject {
  
  var attribution: js.UndefOr[String] = js.undefined
  
  var buffer: js.UndefOr[Double] = js.undefined
  
  var cluster: js.UndefOr[Double | Boolean] = js.undefined
  
  var clusterMaxZoom: js.UndefOr[Double] = js.undefined
  
  /**
    * Minimum number of points necessary to form a cluster if clustering is enabled. Defaults to `2`.
    */
  var clusterMinPoints: js.UndefOr[Double] = js.undefined
  
  var clusterProperties: js.UndefOr[js.Object] = js.undefined
  
  var clusterRadius: js.UndefOr[Double] = js.undefined
  
  var data: js.UndefOr[
    (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
  ] = js.undefined
  
  var filter: js.UndefOr[Any] = js.undefined
  
  var generateId: js.UndefOr[Boolean] = js.undefined
  
  var lineMetrics: js.UndefOr[Boolean] = js.undefined
  
  var maxzoom: js.UndefOr[Double] = js.undefined
  
  var promoteId: js.UndefOr[PromoteIdSpecification] = js.undefined
  
  var tolerance: js.UndefOr[Double] = js.undefined
}
object GeoJSONSourceOptions {
  
  inline def apply(): GeoJSONSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoJSONSourceOptions]
  }
  
  extension [Self <: GeoJSONSourceOptions](x: Self) {
    
    inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
    
    inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
    
    inline def setBuffer(value: Double): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    
    inline def setBufferUndefined: Self = StObject.set(x, "buffer", js.undefined)
    
    inline def setCluster(value: Double | Boolean): Self = StObject.set(x, "cluster", value.asInstanceOf[js.Any])
    
    inline def setClusterMaxZoom(value: Double): Self = StObject.set(x, "clusterMaxZoom", value.asInstanceOf[js.Any])
    
    inline def setClusterMaxZoomUndefined: Self = StObject.set(x, "clusterMaxZoom", js.undefined)
    
    inline def setClusterMinPoints(value: Double): Self = StObject.set(x, "clusterMinPoints", value.asInstanceOf[js.Any])
    
    inline def setClusterMinPointsUndefined: Self = StObject.set(x, "clusterMinPoints", js.undefined)
    
    inline def setClusterProperties(value: js.Object): Self = StObject.set(x, "clusterProperties", value.asInstanceOf[js.Any])
    
    inline def setClusterPropertiesUndefined: Self = StObject.set(x, "clusterProperties", js.undefined)
    
    inline def setClusterRadius(value: Double): Self = StObject.set(x, "clusterRadius", value.asInstanceOf[js.Any])
    
    inline def setClusterRadiusUndefined: Self = StObject.set(x, "clusterRadius", js.undefined)
    
    inline def setClusterUndefined: Self = StObject.set(x, "cluster", js.undefined)
    
    inline def setData(
      value: (Feature[Geometry, GeoJsonProperties]) | (FeatureCollection[Geometry, GeoJsonProperties]) | String
    ): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setGenerateId(value: Boolean): Self = StObject.set(x, "generateId", value.asInstanceOf[js.Any])
    
    inline def setGenerateIdUndefined: Self = StObject.set(x, "generateId", js.undefined)
    
    inline def setLineMetrics(value: Boolean): Self = StObject.set(x, "lineMetrics", value.asInstanceOf[js.Any])
    
    inline def setLineMetricsUndefined: Self = StObject.set(x, "lineMetrics", js.undefined)
    
    inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
    
    inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
    
    inline def setPromoteId(value: PromoteIdSpecification): Self = StObject.set(x, "promoteId", value.asInstanceOf[js.Any])
    
    inline def setPromoteIdUndefined: Self = StObject.set(x, "promoteId", js.undefined)
    
    inline def setTolerance(value: Double): Self = StObject.set(x, "tolerance", value.asInstanceOf[js.Any])
    
    inline def setToleranceUndefined: Self = StObject.set(x, "tolerance", js.undefined)
  }
}
