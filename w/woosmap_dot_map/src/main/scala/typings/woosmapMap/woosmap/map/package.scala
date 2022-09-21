package typings.woosmapMap.woosmap.map

import typings.woosmapMap.woosmap.map.data.Feature
import typings.woosmapMap.woosmapMapStrings.LineString
import typings.woosmapMap.woosmapMapStrings.MultiLineString
import typings.woosmapMap.woosmapMapStrings.MultiPoint
import typings.woosmapMap.woosmapMapStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BasePolygon = BaseGeometry

type Coordinates = js.Tuple2[Double, Double]

type GeoJSONGeometry = GeoJSONPoint | GeoJSONMultiPoint | GeoJSONLineString | GeoJSONMultiLineString | GeoJSONPolygon | GeoJSONMultiPolygon | GeoJSONGeometryCollection

type GeoJSONLineString = GeoJSONRawGeometry[LineString, js.Array[GeoJSONPosition]]

type GeoJSONMultiLineString = GeoJSONRawGeometry[MultiLineString, js.Array[js.Array[GeoJSONPosition]]]

type GeoJSONMultiPoint = GeoJSONRawGeometry[MultiPoint, js.Array[GeoJSONPosition]]

type GeoJSONMultiPolygon = GeoJSONRawGeometry[MultiPolygon, js.Array[js.Array[js.Array[GeoJSONPosition]]]]

type GeoJSONPoint = GeoJSONRawGeometry[typings.woosmapMap.woosmapMapStrings.Point, GeoJSONPosition]

type GeoJSONPolygon = GeoJSONRawGeometry[typings.woosmapMap.woosmapMapStrings.Polygon, js.Array[js.Array[GeoJSONPosition]]]

type GeoJSONPosition = js.Tuple2[Double, Double]

type GeometryArray = js.Array[GeometryCollectionElement]

type StyleFunction = js.Function1[/* feature */ Feature, StyleOptions]
