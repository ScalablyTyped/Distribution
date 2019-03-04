package typings
package topojsonLib.topojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UsAtlas
  extends topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ] {
  @JSName("bbox")
  var bbox_UsAtlas: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  @JSName("objects")
  var objects_UsAtlas: topojsonLib.Anon_Counties
  @JSName("transform")
  var transform_UsAtlas: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform
}

object UsAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Arc],
    bbox: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    objects: topojsonLib.Anon_Counties,
    transform: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform,
    type_Topology: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology | geojsonLib.geojsonMod.GeoJsonGeometryTypes = null
  ): UsAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs, bbox = bbox, objects = objects, transform = transform)
    __obj.updateDynamic("type")(type_Topology)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsAtlas]
  }
}

