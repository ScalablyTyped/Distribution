package typings
package topojsonDashSpecificationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashSpecificationMod {
  type Arc = js.Array[Positions]
  type ArcIndexes = js.Array[scala.Double]
  type GeometryObject[P /* <: Properties */] = Point[P] | MultiPoint[P] | LineString[P] | MultiLineString[P] | Polygon[P] | MultiPolygon[P] | GeometryCollection[P] | NullObject
  type OrNull[T /* <: Objects[js.Object] */] = topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.OrNull with T
  type Positions = js.Array[scala.Double]
  type Properties = geojsonLib.geojsonMod.GeoJsonProperties
}
