package typings.terraformerWkt

import typings.geojson.mod.GeoJSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@terraformer/wkt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def geojsonToWKT(geojson: GeoJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("geojsonToWKT")(geojson.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def wktToGeoJSON(wkt: String): GeoJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("wktToGeoJSON")(wkt.asInstanceOf[js.Any]).asInstanceOf[GeoJSON]
}
