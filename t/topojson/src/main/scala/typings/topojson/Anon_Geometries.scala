package typings.topojson

import typings.topojson.topojsonStrings.GeometryCollection
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.MultiPolygon
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Geometries extends js.Object {
  var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]
  var `type`: GeometryCollection
}

object Anon_Geometries {
  @scala.inline
  def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]], `type`: GeometryCollection): Anon_Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Geometries]
  }
}

