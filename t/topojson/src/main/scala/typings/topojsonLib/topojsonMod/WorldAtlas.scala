package typings
package topojsonLib.topojsonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas
  extends topojsonDashSpecificationLib.topojsonDashSpecificationMod.Topology[
      topojsonDashSpecificationLib.topojsonDashSpecificationMod.Objects[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Properties]
    ] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double]
  @JSName("objects")
  var objects_WorldAtlas: topojsonLib.Anon_Countries
  @JSName("transform")
  var transform_WorldAtlas: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform
}

object WorldAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[topojsonDashSpecificationLib.topojsonDashSpecificationMod.Arc],
    bbox: js.Tuple4[scala.Double, scala.Double, scala.Double, scala.Double],
    objects: topojsonLib.Anon_Countries,
    transform: topojsonDashSpecificationLib.topojsonDashSpecificationMod.Transform,
    type_Topology: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology,
    `type`: topojsonDashSpecificationLib.topojsonDashSpecificationLibStrings.Topology | geojsonLib.geojsonMod.GeoJsonGeometryTypes = null
  ): WorldAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs, bbox = bbox, objects = objects, transform = transform)
    __obj.updateDynamic("type")(type_Topology)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldAtlas]
  }
}

