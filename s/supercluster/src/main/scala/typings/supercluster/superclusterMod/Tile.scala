package typings.supercluster.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tile[C, P] extends js.Object {
  var features: js.Array[TileFeature[C, P]]
}

object Tile {
  @scala.inline
  def apply[C, P](features: js.Array[TileFeature[C, P]]): Tile[C, P] = {
    val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Tile[C, P]]
  }
}

