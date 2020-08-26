package typings.topojson.anon

import typings.topojson.topojsonStrings.GeometryCollection
import typings.topojsonSpecification.mod.MultiPolygon
import typings.topojsonSpecification.mod.Polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Geometries extends js.Object {
  var geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]] = js.native
  var `type`: GeometryCollection = js.native
}

object Geometries {
  @scala.inline
  def apply(geometries: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]], `type`: GeometryCollection): Geometries = {
    val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometries]
  }
  @scala.inline
  implicit class GeometriesOps[Self <: Geometries] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometriesVarargs(value: (Polygon[js.Object] | MultiPolygon[js.Object])*): Self = this.set("geometries", js.Array(value :_*))
    @scala.inline
    def setGeometries(value: js.Array[Polygon[js.Object] | MultiPolygon[js.Object]]): Self = this.set("geometries", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: GeometryCollection): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

