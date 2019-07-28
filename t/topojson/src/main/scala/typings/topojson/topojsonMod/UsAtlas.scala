package typings.topojson.topojsonMod

import typings.geojson.geojsonMod.GeoJsonGeometryTypes
import typings.topojson.Anon_Counties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Arc
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Objects
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Properties
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Topology
import typings.topojsonDashSpecification.topojsonDashSpecificationMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_UsAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_UsAtlas: Anon_Counties
  @JSName("transform")
  var transform_UsAtlas: Transform
}

object UsAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: Anon_Counties,
    transform: Transform,
    type_Topology: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Topology,
    `type`: typings.topojsonDashSpecification.topojsonDashSpecificationStrings.Topology | GeoJsonGeometryTypes = null
  ): UsAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs, bbox = bbox, objects = objects, transform = transform)
    __obj.updateDynamic("type")(type_Topology)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsAtlas]
  }
}

