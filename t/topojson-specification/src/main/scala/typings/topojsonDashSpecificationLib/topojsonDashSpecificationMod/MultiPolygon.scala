package typings
package topojsonDashSpecificationLib.topojsonDashSpecificationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultiPolygon[P /* <: Properties */] extends GeometryObjectA[P] {
  var arcs: js.Array[js.Array[ArcIndexes]]
  @JSName("type")
  var type_MultiPolygon: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.MultiPolygon
}

