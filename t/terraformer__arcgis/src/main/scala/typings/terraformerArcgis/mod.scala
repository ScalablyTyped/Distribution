package typings.terraformerArcgis

import typings.arcgisRestApi.mod.Geometry
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeometryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@terraformer/arcgis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def arcgisToGeoJSON(arcgis: Geometry): GeometryObject = ^.asInstanceOf[js.Dynamic].applyDynamic("arcgisToGeoJSON")(arcgis.asInstanceOf[js.Any]).asInstanceOf[GeometryObject]
  inline def arcgisToGeoJSON(arcgis: Geometry, idAttribute: String): GeometryObject = (^.asInstanceOf[js.Dynamic].applyDynamic("arcgisToGeoJSON")(arcgis.asInstanceOf[js.Any], idAttribute.asInstanceOf[js.Any])).asInstanceOf[GeometryObject]
  
  inline def geojsonToArcGIS(geojson: GeoJSON): Geometry = ^.asInstanceOf[js.Dynamic].applyDynamic("geojsonToArcGIS")(geojson.asInstanceOf[js.Any]).asInstanceOf[Geometry]
  inline def geojsonToArcGIS(geojson: GeoJSON, idAttribute: String): Geometry = (^.asInstanceOf[js.Dynamic].applyDynamic("geojsonToArcGIS")(geojson.asInstanceOf[js.Any], idAttribute.asInstanceOf[js.Any])).asInstanceOf[Geometry]
}
