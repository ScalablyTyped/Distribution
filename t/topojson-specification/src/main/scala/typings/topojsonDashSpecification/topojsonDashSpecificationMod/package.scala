package typings.topojsonDashSpecification

import org.scalablytyped.runtime.StringDictionary
import typings.geojson.geojsonMod.GeoJsonProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashSpecificationMod {
  type Arc = js.Array[Positions]
  type ArcIndexes = js.Array[Double]
  type Objects[P /* <: Properties */] = StringDictionary[GeometryObject[P]]
  type OrNull[T /* <: Objects[js.Object] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ typings.topojsonDashSpecification.topojsonDashSpecificationStrings.OrNull with T
  type Positions = js.Array[Double]
  type Properties = GeoJsonProperties
}
