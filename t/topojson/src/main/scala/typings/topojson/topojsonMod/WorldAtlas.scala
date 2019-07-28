package typings.topojson.topojsonMod

import typings.geojson.geojsonMod.GeoJsonGeometryTypes
import typings.topojson.Anon_Countries
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Arc
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_WorldAtlas: Anon_Countries
  @JSName("transform")
  var transform_WorldAtlas: Transform
}

object WorldAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: Anon_Countries,
    transform: Transform,
    type_Topology: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Topology,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Topology | GeoJsonGeometryTypes = null
  ): WorldAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs, bbox = bbox, objects = objects, transform = transform)
    __obj.updateDynamic("type")(type_Topology)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldAtlas]
  }
}

