package typings.supercluster.mod

import typings.supercluster.superclusterNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileFeature[C, P] extends js.Object {
  
  var geometry: js.Array[js.Tuple2[Double, Double]] = js.native
  
  var tags: (ClusterProperties with C) | P = js.native
  
  var `type`: `1` = js.native
}
object TileFeature {
  
  @scala.inline
  def apply[C, P](geometry: js.Array[js.Tuple2[Double, Double]], tags: (ClusterProperties with C) | P, `type`: `1`): TileFeature[C, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileFeature[C, P]]
  }
  
  @scala.inline
  implicit class TileFeatureOps[Self <: TileFeature[_, _], C, P] (val x: Self with (TileFeature[C, P])) extends AnyVal {
    
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
    def setGeometryVarargs(value: (js.Tuple2[Double, Double])*): Self = this.set("geometry", js.Array(value :_*))
    
    @scala.inline
    def setGeometry(value: js.Array[js.Tuple2[Double, Double]]): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: (ClusterProperties with C) | P): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `1`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
