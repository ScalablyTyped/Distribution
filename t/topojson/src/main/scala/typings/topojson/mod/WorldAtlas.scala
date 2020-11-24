package typings.topojson.mod

import typings.topojson.anon.Countries
import typings.topojsonSpecification.mod.Arc
import typings.topojsonSpecification.mod.Objects
import typings.topojsonSpecification.mod.Properties
import typings.topojsonSpecification.mod.Topology
import typings.topojsonSpecification.mod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorldAtlas extends Topology[Objects[Properties]] {
  
  @JSName("bbox")
  var bbox_WorldAtlas: js.Tuple4[Double, Double, Double, Double] = js.native
  
  @JSName("objects")
  var objects_WorldAtlas: Countries = js.native
  
  @JSName("transform")
  var transform_WorldAtlas: Transform = js.native
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
  
  @scala.inline
  implicit class WorldAtlasOps[Self <: WorldAtlas] (val x: Self) extends AnyVal {
    
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
    def setBbox(value: js.Tuple4[Double, Double, Double, Double]): Self = this.set("bbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjects(value: Countries): Self = this.set("objects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransform(value: Transform): Self = this.set("transform", value.asInstanceOf[js.Any])
  }
}
