package typings.wellknown

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GeoJSONGeometry = typings.wellknown.mod.GeoJSONPoint | typings.wellknown.mod.GeoJSONMultiPoint | typings.wellknown.mod.GeoJSONLineString | typings.wellknown.mod.GeoJSONMultiLineString | typings.wellknown.mod.GeoJSONPolygon | typings.wellknown.mod.GeoJSONMultiPolygon | scala.Null
  
  type GeoJSONLineString = typings.wellknown.mod.Geometry[
    typings.wellknown.wellknownStrings.LineString, 
    js.Array[typings.wellknown.mod.GeoJSONPosition]
  ]
  
  type GeoJSONMultiLineString = typings.wellknown.mod.Geometry[
    typings.wellknown.wellknownStrings.MultiLineString, 
    js.Array[js.Array[typings.wellknown.mod.GeoJSONPosition]]
  ]
  
  type GeoJSONMultiPoint = typings.wellknown.mod.Geometry[
    typings.wellknown.wellknownStrings.MultiPoint, 
    js.Array[typings.wellknown.mod.GeoJSONPosition]
  ]
  
  type GeoJSONMultiPolygon = typings.wellknown.mod.Geometry[
    typings.wellknown.wellknownStrings.MultiPolygon, 
    js.Array[js.Array[js.Array[typings.wellknown.mod.GeoJSONPosition]]]
  ]
  
  type GeoJSONPoint = typings.wellknown.mod.Geometry[typings.wellknown.wellknownStrings.Point, typings.wellknown.mod.GeoJSONPosition]
  
  type GeoJSONPolygon = typings.wellknown.mod.Geometry[
    typings.wellknown.wellknownStrings.Polygon, 
    js.Array[js.Array[typings.wellknown.mod.GeoJSONPosition]]
  ]
  
  type GeoJSONPosition = (js.Tuple2[scala.Double, scala.Double]) | (js.Tuple3[scala.Double, scala.Double, scala.Double])
}
