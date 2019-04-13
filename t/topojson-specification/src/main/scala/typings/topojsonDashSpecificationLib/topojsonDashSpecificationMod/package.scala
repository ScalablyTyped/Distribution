package typings
package topojsonDashSpecificationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object topojsonDashSpecificationMod {
  type Arc = js.Array[Positions]
  type ArcIndexes = js.Array[scala.Double]
  type Objects[P /* <: Properties */] = org.scalablytyped.runtime.StringDictionary[GeometryObject[P]]
  type OrNull[T /* <: Objects[js.Object] */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: T[P] | topojson-specification.topojson-specification.NullObject}
    */ topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.OrNull with T
  type Positions = js.Array[scala.Double]
  type Properties = geojsonLib.geojsonMod.GeoJsonProperties
}
