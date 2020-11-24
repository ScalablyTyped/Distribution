package typings.supercluster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tile[C, P] extends js.Object {
  
  var features: js.Array[TileFeature[C, P]] = js.native
}
object Tile {
  
  @scala.inline
  def apply[C, P](features: js.Array[TileFeature[C, P]]): Tile[C, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tile[C, P]]
  }
  
  @scala.inline
  implicit class TileOps[Self <: Tile[_, _], C, P] (val x: Self with (Tile[C, P])) extends AnyVal {
    
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
    def setFeaturesVarargs(value: (TileFeature[C, P])*): Self = this.set("features", js.Array(value :_*))
    
    @scala.inline
    def setFeatures(value: js.Array[TileFeature[C, P]]): Self = this.set("features", value.asInstanceOf[js.Any])
  }
}
