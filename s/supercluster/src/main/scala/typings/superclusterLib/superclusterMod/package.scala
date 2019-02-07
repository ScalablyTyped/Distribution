package typings
package superclusterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object superclusterMod {
  type ClusterFeature[C] = PointFeature[ClusterProperties with C]
  type PointFeature[P] = geojsonLib.geojsonMod.Feature[geojsonLib.geojsonMod.Point, P]
}
