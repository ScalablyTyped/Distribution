package typings.topojson.mod

import typings.topojson.anon.Countries
import typings.topojsonSpecification.mod.Arc
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import typings.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorldAtlas extends Topology[Objects[Properties]] {
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double]
  @JSName("objects")
  var objects_WorldAtlas: Countries
  @JSName("transform")
  var transform_WorldAtlas: Transform
}

object WorldAtlas {
  @scala.inline
  def apply(
    arcs: js.Array[Arc],
    bbox: js.Tuple4[Double, Double, Double, Double],
    objects: Countries,
    transform: Transform,
    `type`: typings.topojsonSpecification.topojsonSpecificationStrings.Topology
  ): WorldAtlas = {
    val __obj = js.Dynamic.literal(arcs = arcs.asInstanceOf[js.Any], bbox = bbox.asInstanceOf[js.Any], objects = objects.asInstanceOf[js.Any], transform = transform.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldAtlas]
  }
}

