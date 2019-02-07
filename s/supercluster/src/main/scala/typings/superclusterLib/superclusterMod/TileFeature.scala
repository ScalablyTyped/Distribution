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

