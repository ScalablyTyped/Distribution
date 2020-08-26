package typings.topojsonSpecification.mod

import typings.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeometryObjectA[P /* <: Properties */] extends TopoJSON {
  var id: js.UndefOr[Double | String] = js.native
  var properties: js.UndefOr[P] = js.native
  @JSName("type")
  var type_GeometryObjectA: GeoJsonGeometryTypes | Null = js.native
}

object GeometryObjectA {
  @scala.inline
  def apply[/* <: typings.topojsonSpecification.mod.Properties */ P](): GeometryObjectA[P] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeometryObjectA[P]]
  }
  @scala.inline
  implicit class GeometryObjectAOps[Self <: GeometryObjectA[_], /* <: typings.topojsonSpecification.mod.Properties */ P] (val x: Self with GeometryObjectA[P]) extends AnyVal {
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
    def setId(value: Double | String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setProperties(value: P): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
    @scala.inline
    def setType(value: GeoJsonGeometryTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

