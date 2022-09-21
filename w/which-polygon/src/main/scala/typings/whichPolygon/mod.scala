package typings.whichPolygon

import typings.geojson.mod.FeatureCollection
import typings.geojson.mod.Geometry
import typings.rbush.mod.default
import typings.whichPolygon.whichPolygonBooleans.`false`
import typings.whichPolygon.whichPolygonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * The input GeoJSON must be a feature collection of polygons or multipolygons.
    * The query returns the properties of the matched polygon feature.
    */
  inline def apply[Properties](data: GeoJson[Properties]): Query[Properties] = ^.asInstanceOf[js.Dynamic].apply(data.asInstanceOf[js.Any]).asInstanceOf[Query[Properties]]
  
  @JSImport("which-polygon", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type BBox = js.Tuple4[/* minLat */ Double, /* maxLat */ Double, /* minLng */ Double, /* maxLng */ Double]
  
  type Coordinates = js.Tuple2[/* lng */ Double, /* lat */ Double]
  
  type GeoJson[Properties] = FeatureCollection[Geometry, Properties]
  
  @js.native
  trait Query[Properties] extends StObject {
    
    def apply(coordinates: Coordinates): Properties | Null = js.native
    def apply(coordinates: Coordinates, multi: `false`): Properties | Null = js.native
    def apply(coordinates: Coordinates, multi: `true`): js.Array[Properties] | Null = js.native
    
    def bbox(bbox: BBox): js.Array[Properties] = js.native
    
    /** @internal */
    var tree: default[Any] = js.native
  }
}
