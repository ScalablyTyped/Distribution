package typings.terraformerArcgis

import typings.arcgisRestApi.mod.Geometry
import typings.geojson.mod.GeoJSON
import typings.geojson.mod.GeometryObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@terraformer/arcgis", "arcgisToGeoJSON")
  @js.native
  def arcgisToGeoJSON(arcgis: Geometry): GeometryObject = js.native
  @JSImport("@terraformer/arcgis", "arcgisToGeoJSON")
  @js.native
  def arcgisToGeoJSON(arcgis: Geometry, idAttribute: String): GeometryObject = js.native
  
  @JSImport("@terraformer/arcgis", "geojsonToArcGIS")
  @js.native
  def geojsonToArcGIS(geojson: GeoJSON): Geometry = js.native
  @JSImport("@terraformer/arcgis", "geojsonToArcGIS")
  @js.native
  def geojsonToArcGIS(geojson: GeoJSON, idAttribute: String): Geometry = js.native
}
