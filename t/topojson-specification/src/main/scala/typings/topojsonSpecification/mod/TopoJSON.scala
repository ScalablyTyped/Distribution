package typings.topojsonSpecification.mod

import typings.geojson.mod.BBox
import typings.geojson.mod.GeoJsonGeometryTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TopoJSON extends js.Object {
  var bbox: js.UndefOr[BBox] = js.native
  var `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes | Null = js.native
}

object TopoJSON {
  @scala.inline
  def apply(): TopoJSON = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TopoJSON]
  }
  @scala.inline
  implicit class TopoJSONOps[Self <: TopoJSON] (val x: Self) extends AnyVal {
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
    def setBbox(value: BBox): Self = this.set("bbox", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBbox: Self = this.set("bbox", js.undefined)
    @scala.inline
    def setType(value: typings.topojsonSpecification.topojsonSpecificationStrings.Topology | GeoJsonGeometryTypes): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
  
}

