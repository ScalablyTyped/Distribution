package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MultiPoint[P /* <: Properties */] extends GeometryObjectA[P] {
  var coordinates: js.Array[Positions]
  @JSName("type")
  var type_MultiPoint: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiPoint
}

