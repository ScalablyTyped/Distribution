package typings
package superclusterLib.superclusterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileFeature[C, P] extends js.Object {
  var geometry: js.Array[js.Tuple2[scala.Double, scala.Double]]
  var tags: (ClusterProperties with C) | P
  var `type`: superclusterLib.superclusterLibNumbers.`1`
}

object TileFeature {
  @scala.inline
  def apply[C, P](
    geometry: js.Array[js.Tuple2[scala.Double, scala.Double]],
    tags: (ClusterProperties with C) | P,
    `type`: superclusterLib.superclusterLibNumbers.`1`
  ): TileFeature[C, P] = {
    val __obj = js.Dynamic.literal(geometry = geometry, tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TileFeature[C, P]]
  }
}

